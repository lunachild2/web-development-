**1. 메서드 오버라이딩(재정의)**
* 하위 클래스에서 상위클래스와 동일 메서드를 정의

* @Override - 재정의된 메서드임을 컴파일러에게 정보를 전달
  - 컴파일러가 컴파일전 형식을 체크
  - 상위 클래스에 동일한 메서드가 정의 X -> 컴파일 X


**2. 접근제어자**
* 작은 범위 -> 큰 범위로 변경 가능
* 동일 패키지
  - dafault -> protected -> public
<br>	<br>
* 외부 패키지
  - protected -> public

* 묵시적 형변환과 메서드 재정의

* 가상 메서드


**3. 추상 클래스**
* 추상적 - 정해지지 않은
  - 추상클래스는 - 메서드의 구현체가 정해지지 않은 클래스

* 구체적 - 확실하게 정해진
  - 구체적 클래스는 - 메서드의 구현체가 정해진 클래스
