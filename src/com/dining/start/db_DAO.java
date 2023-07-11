package com.dining.start;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class db_DAO {
	
	// 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	// 싱글턴 패턴 (동기화 처리) : 프로그램이 종료될 때 까지 한번 만들어진 객체를 재 사용한다.
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = db_Service.getFactory().openSession();
		}
		return ss;
	} 
	
	// 아이디 불러오는 메서드 getID
	public static db_VO getid(db_VO vo) {
		vo = getSession().selectOne("getID",vo);
		return vo; 
	}
	
	public static db_VO login(db_VO vo) {
		vo = getSession().selectOne("login",vo);
		return vo;
	}
	
	public static List<db_VO> getidAll(){
		List<db_VO> list = getSession().selectList("ID");
		// ID 리스트를 받아온다.
		return list;
	}
	
//	public static db_VO findYourId(db_VO vo){
////		vo = getSession().selectOne("findyourid");
//		db_VO vo2 = new db_VO();
//		vo2 = getSession().selectOne("findyourid",vo);
//		
//		// ID 리스트를 받아온다.
//		return vo2;
//	}
	
	public static db_VO findYourId(db_VO vo) {
        vo = getSession().selectOne("getID",vo);
        return vo; 
    }
	
	// ID 체크하는 DAO, 입력한 ID가 있는지 여부를 boolean으로 반환
	public static boolean getidChk(String ID){
        boolean result = false;
        db_VO vo = getSession().selectOne("idChk",ID);
        if(vo == null) {
            result = true;
        }
        return result;
	}

	public static int insInfoMember(db_VO vo){
        int result = getSession().insert("infoIns",vo);
        ss.commit();
        return result;
    }
	
	// 하영 재훈 마이페이지 정보 불러오기
	public static db_VO getmyid(String id) {
        db_VO vo = getSession().selectOne("getmyid" , id);
        return vo;
    }
	
	public static db_VO getpwChk(String ID){
		db_VO vo = getSession().selectOne("pwChk", ID );
	
		return vo;
	}
	
	public static int getDelete(String id) {
        int result = getSession().delete("infoDel",id);
        ss.commit();
        return result;        
    }
    
    public static int getUpdate(db_VO vo) {
        int result = getSession().update("infoUpdate",vo);
        ss.commit();
        return result; 
    }
    
    // 좌현 id찾기
	public static db_VO findid(db_VO vo) {
		System.out.println(vo.getName());
		System.out.println(vo.getEmail());
		System.out.println(vo.getBirthday());
        vo = getSession().selectOne("findid",vo);
        return vo; 
    }

	
    
	 // 21 재훈 검색기능 (검색어 존재여부)
	 public static db_VO getSearch_Ck(db_VO vo){
		 vo = getSession().selectOne("Search_Ck", vo);
		 return vo; 
	 }
	 // 21 재훈 검색기능
	 public static List<db_VO> getSearch(String search){
		 List<db_VO> list = getSession().selectList("Search", search);
		 return list;
	 }
	// 22 재훈 가게 정보 받아오기
	 public static db_VO getStoreInfo(db_VO vo){
			 vo = getSession().selectOne("storeInfo", vo);
			 return vo; 
	}
	 
	 //	
	 // 22 가게버튼을 눌렀을때 접속아이디에 대한 좋아요 정보 있는지 체크	
	 public static db_VO getIdFavorite_ck(String search){	
		 db_VO vo = getSession().selectOne("IdFavorite_ck", search);	
		 return vo; 	
	 }	
	 	
	 // 22 가게버튼을 눌렀을때 접속아이디에 대한 좋아요 정보	
	 public static List<db_VO> getIdFavorite(String search){	
		 List<db_VO> list = getSession().selectList("IdFavorite", search);	
		 return list;	
	 }
	 
	 // 23 카테고리별 best 가게이름 가져오기
	 public static db_VO getCategory(db_VO vo){
		 vo = getSession().selectOne("category", vo);
		 return vo; 
	 }
	 // 24 카테고리별 가게 테이블 보여주기
	 public static List<db_VO> getCategory_tb(db_VO vo){
		 List<db_VO> list = getSession().selectList("table_cate", vo);
		 return list; 
	 }
	 
	 // 재훈 25 좋아요 업데이트or삽입	
	 public static int changeFavorite(db_VO vo) {	
	    	int result = getSession().update("insertOrUpdateFavorite",vo);	
	    	ss.commit();	
	    	return result;	
	    }		
	 
	 // 좌현 26번 id찾기
	 public static db_VO findid2(db_VO vo) {
		 vo = getSession().selectOne("findid2",vo);
		 return vo; 
	 }
	 
	 // 좌현 27번 pw찾기
	 public static db_VO findpw(db_VO vo) {
		 vo = getSession().selectOne("findpw",vo);
		 return vo;
	 }
	 
	 // 좌현 28번 가게 이미지 화면
	 public static db_VO getImage(db_VO vo) {
		 vo = getSession().selectOne(null);
		 return null;
	 }
	 
    // 상우 best 식당명, 평점, 카테고리 받아오기
    public static db_VO getbestAll(){
    	db_VO vo = getSession().selectOne("bestOfAll"); 
//        List<db_VO> list = null;
//        list = getSession().selectList("bestOfAll");
//        System.out.println("DAO에 list 받아왔음");
//		return list;
    	return vo;
    }

    // 상우 37 (비밀번호 일치 확인용 비번 받아오기)
    public static String getPwforChk(){
    	String result = getSession().selectOne("getPw"); 
    	return result;
    }
    
    // 38번 상우 DAO (비밀번호 변경), update문은 int형으로 받아야 함.
    public static int changePw(db_VO vo) {
    	int result = getSession().update("changePw",vo);
    	ss.commit();
    	return result;
    }
    
    // 39번 상우 식당리뷰 넣기
    public static int insReview(db_VO vo) {
    	int result = getSession().update("insReview",vo);
    	ss.commit();
    	return result;
    }
    
    // 39번 상우 식당명에 해당하는 식당번호 받아오기
    public static String findDiner(String diner_name){
    	String result_no = "";
		result_no = getSession().selectOne("findDiner",diner_name); 
        return result_no;
    }
    
    // 윤성훈 DAO 41~
    //41
    public static List<db_VO> getreviewAll(){// 리뷰리스트 전부 받아오기
        List<db_VO> list = null;
        list = getSession().selectList("reviewAll");
        return list;
    }
    //42
    public static List<db_VO> s_namereview(String diner_name){// 가게이름으로 리뷰 검색
        List<db_VO> list = null;
        list = getSession().selectList("s_namereview",diner_name);
        return list;
    }
    //43
    public static List<db_VO> getidreview(String id){// 회원아이디로 리뷰 검색
        List<db_VO> list = null;
        list = getSession().selectList("idreview", id);
        return list;
    }
    
    //44
    public static List<db_VO> getmeminfoAll(){// 회원정보 전부 받아오기
        List<db_VO> list = null;
        list = getSession().selectList("memberAll");
        return list;
    }
    
    //45
        public static db_VO IdinfoSh(db_VO vo){// 회원아이디로 특정 회원정보 검색
            vo = getSession().selectOne("shmbid",vo); 
            return vo;
    }
        
      //46	
        public static int delmember(db_VO vo) {	
          int result = getSession().delete("delmember",vo);	
          ss.commit();	
          return result;	
       }	
        	
      //48	
       public static List<db_VO> getStoreInfoAll(){// 가게정보 전부 받아오기	
            List<db_VO> list = null;	
            list = getSession().selectList("getStoreInfoAll");	
            return list;	
        }	
       //49 Admin03_rest 페이지 음식점이름으로 불러오기	
       public static db_VO callFsName(db_VO vo){// 회원아이디로 특정 회원정보 검색	
           vo = getSession().selectOne("CallFsName",vo); 	
           return vo;	
       }	
       //50 Admin03_rest 페이지 음식분류로 불러오기	
       public static List<db_VO> callFoodCtg(db_VO vo){// 회원아이디로 특정 회원정보 검색\	
      	 List<db_VO> list = null; 	
           list = getSession().selectList("CallFct",vo);	
           return list;	
       }	
       	
       //51 Admin03_rest 페이지 신규 가게 등록	
       public static int insStore(db_VO vo) {	
      	 int result = getSession().insert("insStore",vo);	
      	 ss.commit();	
      	 return result;	
       }	
       	
       // 53 Admin03_rest 페이지 음식점 삭제 버튼	
       public static int delStore(db_VO vo) {	
      	 int result = getSession().delete("delStore",vo);	
      	 ss.commit();	
      	 return result;	
       }	
       	
       // 55 Admin03_rest 페이지 가게 불러오기 버튼	
       public static db_VO callStore(db_VO vo) {	
      	 vo = getSession().selectOne("callStore",vo);	
      	 return vo;	
       }	
       // 56 Admin03_rest 페이지 가게 수정 버튼	
       public static int storeUpdate(db_VO vo) {	
           int result = getSession().update("storeUpdate",vo);	
           ss.commit();	
           return result; 	
       }
        
        
        //51 검색할게 있는지 확인
        public static db_VO getinfoReview_ck(db_VO vo){
   		 vo = getSession().selectOne("infoReview_Ck", vo);
   		 return vo; 
   	 }
      //51
        public static List<db_VO> getinfoReview(String search) {
    		List<db_VO> list = getSession().selectList("infoReview",search);
    		return list;
    	}
 
     // 77 상화 best 식당명, 평점, 카테고리 받아오기
        public static List<db_VO> getbestAll2(){
        	List<db_VO> list = getSession().selectList("bestOfAll2"); 
        	return list;
        }
        
        // 88 상우 가게 별점 받아오기
    	 public static db_VO getStoreStar(db_VO vo) {
    		 db_VO result = getSession().selectOne("storeStar", vo);
    		 return result;
    	 }
//	public static db_VO getid2(String name, String email, String birth){
//		List<db_VO> = db_VO 
//		
//		db_VO vo = getSession().selectOne(name);
//		db_VO vo2 = getSession().selectOne(email);
//		db_VO vo3 = getSession().selectOne(birth);
//
//		retrun result;
//
//	}
}