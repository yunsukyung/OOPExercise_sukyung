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
		}
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다."); return;



	}

	public void printAllMember() {
		// TODO Auto-generated method stub

	}

	public void searchId() {
		System.out.println("검색할 아이디를 입력하세요 : ");
		String id = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId() == id) {
				System.out.println(m[i].printOne());
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); break;
			}
		}

	}

	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String name = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName() == name) {
				System.out.println(m[i].printOne());
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); break;
			}
		}
	}

	public void searchEmail() {
		System.out.println("검색할 이메일을 입력하세요 : ");
		String email = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail() == email) {
				System.out.println(m[i].printOne());
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); break;
			}
		}

	}

	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId() == userId) {
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
			if(m[i].getUserId() == userId) {
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
			if(m[i].getUserId() == userId) {
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
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}


}
