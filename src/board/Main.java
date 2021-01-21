package board;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Article> articles = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Article article1 = new Article(1, "제목1", "내용1");
		Article article2 = new Article(2, "제목2", "내용2");
		Article article3 = new Article(3, "제목3", "내용3");
		
		articles.add(article1);
		articles.add(article2);
		articles.add(article3);
		
		int lastId = 4;
		
		while (true) {
			System.out.println("명령어 입력해주세요 :");
			String str = sc.next();
			if (str.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}

			else if (str.equals("add")) {
				
				System.out.println("게시물 제목을 입력해주세요 :");
				String title = sc.next();
				
				System.out.println("게시물 내용을 입력해주세요 :");
				String body = sc.next();
				
				Article article = new Article(lastId, title, body);
				lastId++;
				
				articles.add(article);
				
				System.out.println("게시물이 등록되었습니다.");

			}
			
			else if(str.equals("list")) {
				for(int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					System.out.println("번호 : " + article.id ); // 번호X, article
					System.out.println("제목 : " + article.title);
					System.out.println("===============================");
				}
			}
			
			else if(str.equals("update")) {
				System.out.println("수정할 게시물 번호 :");
				int id = sc.nextInt();
				int targetIdx = getIndexByArticleId(id);
				
				if(targetIdx != -1) {
					System.out.println("제목 : ");
					String title = sc.next(); // 1
					
					System.out.println("내용 : ");
					String body = sc.next();	
					
					Article article = new Article(id, title, body);
					
					articles.set(targetIdx, article);

					System.out.println("수정이 완료되었습니다.");
					
				} else {
					System.out.println("없는 게시물입니다.");
				}
				
				
			} else if(str.equals("delete")) {
				
				System.out.println("삭제할 게시물 번호 :");
				int id = sc.nextInt();
				int targetIdx = getIndexByArticleId(id);
				
				if(targetIdx != -1) {
					
					articles.remove(targetIdx);
					
					System.out.println("삭제가 완료되었습니다.");
				} else {
					System.out.println("없는 게시물입니다.");
				}
			} else if(str.equals("read")) {
				System.out.println("상세보기 할 게시물 번호 :");
				int id = sc.nextInt();
				int targetIdx = getIndexByArticleId(id);
				
				if(targetIdx != -1) {
					Article article = articles.get(targetIdx);
					
					System.out.println("====== " + article.id + "번 게시물 ======");
					System.out.println("번호 : " + article.id);
					System.out.println("제목 : " + article.title);
					System.out.println("내용 : " + article.body);
					System.out.println("========================");
					
				} else {
					System.out.println("없는 게시물입니다.");
				}
			}
		}

	}
	
	public static int getIndexByArticleId(int id) {
		int targetIdx = -1; 
		
		for(int i = 0; i < articles.size(); i++) {
			if(articles.get(i).id == id) {
				targetIdx = i;
			}
		}
		
		return targetIdx;
	}
	
	

}
