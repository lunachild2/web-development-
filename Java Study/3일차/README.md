# 1. 복합 대입 연산자(단항)
* 산술연산자(+, -, *, /, %) + 대입(=)
```
num = num + 2; => num += 2;
num = num * 2; => num *= 2;
```
***	
# 2. 조건 연산자(삼항 조건 연산자)

* 조건식 ? 참일때 : 거짓일때
	>(1항) ? (2항) :	 (3항)

* String -> 문자 여러개 "ABC"

* char : 문자 1개 'A'

***
# 3. 연산자 우선순위

* = (대입) < 	... 논리 < 비교 ....	<	단항.. < (	)
***

# 4. 조건문
```
{
 .... 실행되는 코드
 }
 ```
 ```
 if ( 조건식 - 참과 거짓 판단하는 연산 ) {
 
	// 참일때 실행되는 코드	
	
} 
```
```
if (조건식1) {

	// 조건식1이 참일때
	
} else if ( 조건식2) {

	//조건식1이 거짓, 조건식2가 참
	
} else {
	 // 조건식이 거짓일때
}
```
***
# 5. 선택문
```
switch (키워드) {
	case 값1 :
		키워드가 값1과 일치할때 수행되는 코드
		break; - 실행 중단
		
	case 값2 :
		키워드가 값2와 일치할때 수행되는 코드
		break;
	.....
	default :
		키워드가 모든 케이스에 매칭 X -> 실행되는 코드
}
```
***
# 6. 반복문
```
while (조건식) {
	// 조건식이 참일때 반복되는 코드
}
```

* 조건식 - 반복을 멈출수 있는 조건
```
do {
	// 조건식이 참일때 반복 수행되는 
	// 조건식이 거짓이더라도 일단 한번은 수행
} while(조건식);
```

