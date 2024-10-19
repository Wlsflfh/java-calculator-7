# 프리코스 1주차 미션 - 문자열 덧셈 계산기

> 우아한테크코스 7기 1주차 미션, 문자열 덧셈 계산기를 구현한 저장소입니다.

# 🏂 전체적인 흐름
1. 덧셈할 문자열을 입력 받는 문구를 출력한다.
2. 사용자로부터 문자열을 입력받는다.
3. 구분자 형식에 대하여 확인한다.
5. 잘못된 값을 입력한 경우, IllegalArgumentException 을 발생시킨 후 종료한다.
6. 입력받은 문자열에서 구분자를 기준으로 분리한 각 숫자의 합을 출력한다.

'''
덧셈할 문자열을 입력해 주세요.
1,2:3
결과 : 6
'''

# 🔧 구현할 기능 목록

- [✅] 덧셈할 문자열을 입력 받는 문구를 출력한다.
- [✅] 사용자로부터 문자열을 입력받는다.
    - [✅] 양의 정수만 포함되었는지 확인한다.
    - [✅] 올바른 구분자만 포함되었는지 확인한다. ( , or : )
    - [✅] 커스텀 구분자의 시작 문자열이 포함되었는지 확인한다. 
    - [✅] 커스텀 구분자 형식을 검증한다.
- [✅] 잘못된 값이 입력된 경우, IllegalArgumentException 을 발생시킨 후 종료한다.
- [✅] 구분자를 기준으로 숫자만 분리한다.
- [✅] 각 숫자의 합을 구한다.
- [✅] 결과를 출력한다.


## 💣 에외에 대한 에러와 검증

### 문자열 입력 및 기본 구분자
- 음수, 0 이 포함된 문자열을 입력할 경우 -> '[ERROR] 문자열에 양의 정수만 포함되어야합니다.'
- 기본 구분자(쉼표, 콜론) 이외에 다른 문자(공백 포함)가 포함된 경우 -> '[ERROR] 기본 구분자와 일치하지 않는 문자가 존재합니다.'
---
- 아무것도 입력하지 않은 경우 'ex) ""' -> 허용
- 기본 구분자가 연속으로 사용된 경우 'ex) ,,,,,:' -> 허용

### 커스텀 구분자
- "//"와 "\n" 사이에 문자열이 위치할 경우 -> '[ERROR] 잘못된 커스텀 구분자 형식입니다.'
- "//"와 "\n" 사이에 아무것도 입력하지 않은 경우 'ex) //\n' -> '[ERROR] 잘못된 커스텀 구분자 형식입니다.'
---
- 기본 구분자와 커스텀 구분자 모두 포함된 경우 'ex) //;\n1;2,3' -> 허용
- "//"와 "\n" 사이에 " " 공백이 포함된 경우 'ex) // \n' -> 허용

# 🗂️ 패키지 목록


