package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);


	public void insertMember() {
		for(int i = 0; i < m.length; i++) {
			System.out.println("ID : ");
			String id = sc.next();
			System.out.println("Password : ");
			String pwd = sc.next();
			System.out.println("name : ");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Age : ");
			int age = sc.nextInt();
			System.out.println("gender : ");
			char gender = sc.next().charAt(0);
			System.out.println("E-mail : ");
			String email = sc.next();

			m[i] = new Member(id, pwd, name, age, gender, email);

			ctn++;
			
			System.out.println("회원정보를 더 입력하시겠습니까?");
			char t = sc.next().charAt(0);
			if(t == 'N' || t == 'n') {
				System.out.println("입력을 종료합니다."); break;
			}
		}
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다."); return;



	}

	public void printAllMember() {
		for(int i = 0; i < ctn; i++) {
			System.out.println(m[i].getUserId());
			System.out.println(m[i].getUserPwd());
			System.out.println(m[i].getUserName());
			System.out.println(m[i].getAge());
			System.out.println(m[i].getGender());
			System.out.println(m[i].getEmail());
			
			System.out.println();
			
		}

	}

	public void searchId() {
		System.out.println("검색할 아이디를 입력하세요 : ");
		String id = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(id)) {
				
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); break;
			}
		}

	}

	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String name = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(name)) {
				
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); break;
			}
		}
	}

	public void searchEmail() {
		System.out.println("검색할 이메일을 입력하세요 : ");
		String email = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(email)) {
				
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); break;
			}
		}

	}

	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.println("변경할 비밀번호를 입력하세요 : ");
				String newPwd = sc.next();
				m[i].setUserPwd(newPwd);
				System.out.println("패스워드 수정이 완료되었습니다."); break;
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); break;
			}
		}
		

	}

	public void updateName() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.println("변경할 이름을 입력하세요 : ");
				String newName = sc.next();
				m[i].setUserName(newName);;
				System.out.println("이름 수정이 완료되었습니다."); break;
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); break;
			}
		}

	}

	public void updateEmail() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.println("변경할 이메일 입력하세요 : ");
				String newEmail = sc.next();
				m[i].setEmail(newEmail);;
				System.out.println("이메일 수정이 완료되었습니다."); break;
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); break;
			}
		}

	}

	public void deleteOne() {
		System.out.println("탈퇴할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				m[i] = m[i + 1];
				ctn--;
			} else {
				System.out.println("삭제할 회원 정보가 존재하지 않습니다."); break;
			}
		}

	}

	public void deleteAll() {
		for(int i = 0; i < ctn; i++) {
			m[i].setUserId(null);
			m[i].setUserPwd(null);
			m[i].setUserName(null);
			m[i].setAge(0);
			m[i].setGender('\u0000');
			m[i].setEmail(null);
			
			ctn = 0;
		}

	}
	
	public void printOne(Member m) {
		System.out.println(m.getUserId());
		System.out.println(m.getUserPwd());
		System.out.println(m.getUserName());
		System.out.println(m.getAge());
		System.out.println(m.getGender());
		System.out.println(m.getEmail());
	}
	
	
	


}
