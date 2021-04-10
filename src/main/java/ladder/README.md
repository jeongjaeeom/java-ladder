# 2단계 - 2단계 - 사다리(생성)

## 기능 요구사항

- 게임 참여하는 사람의 이름 최대 5글자 부여 가능
- 사다리 출력할 시, 사람의 이름도 같이 출력
- 사람의 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 함
- 라인 겹치지 않도록 해야함
- 사다리 실행 결과를 출력
- 개인별 이름을 입력하면 개인별 결과를 출력
  - "all"을 입력 시 전체 참여자의 실행 결과를 출력


## 기능 목록
- 참여할 사람 이름 입력
    - 쉼표(,) 구분
    - 이름 당 5자
    - 유효성


- 사다리 높이 입력
    - 유효성 체크


- 실행 결과 입력
  - 쉼표(,) 구분


- 참여자
  - 이름(중복 허용 X)
  - 라인 번호(사다리 타기 인덱스)
  

- 라인 번호
  - 유효성
    - 숫자만
    - 양수
  

- 사다리
    - 라인 List
    - 높이만큼 Line 추가
    - 유효성 
      - 최소 높이 1 이상


- 라인
    - 포인트 List
    - 사람 수 = 넓이
    - 유효성 
      - 최소 참여자 수 2명 이상


- 포인트
    - Point (true/false)
    - 라인별 번호
    - 이동 판단
      - 현재 Point 기준, 이전/현재/다음 Point 이동 판단


- 사다리 생성
    - 랜덤
    - 라인 겹침 방지
        - 이전 Point, 현재 Point 체크
  
  
- 사다리 타기 실행
  - Player 라인번호 기준 실행
  - 포인트 판단 기준 라인별 이동 
  - Player 별 마지막 이동 LineNumber 리턴


- 실행 결과
  - 라인번호
  - Player
  

- 결과 상품
  - 번호
  - 상품

