# breadBro

### 1-1 환경설정

  운영 환경이나, 개발 환경이냐?

  # JRE(Java Runtime Environment Kit)   java로 개발된 class를 실행 운영 할 떄

  # JDK(Java Developement Kit) 개발에 필요한 환경



  # JVM(Java Virtual Machine) 컴파일된 class 파일을 각각의 OS 특성에서 동작할 수 있도록 해석해서 전달  각각 OS별로 JVM이 다르기 때문에 OS에 맞는 코드로 해석함



  ## OpenJDK 다운로드, Eclipse 다운로드 한다. (zip파일로)

  # 프로젝트 마다 JDK 버전이 다를 수 있으므로  따로 환경설정을 해주지 않고

    EclIpse폴더 내 eclipse.ini 파일을 실행시켜 수정해준다. 
 
      -> 14~15번 라인에 JDK 폴더 bin의 javaw.exe 경로를 입력해주면 된다. 
      예)  -vm
           C:\breadBro\JDK\jdk-16.0.1\bin\javaw.exe



### 1-2 환경설정

  # encoding -> utf-8로 변경

  # maven 프로젝트 생성 및 pom.xml 작성. <java.version> 설정


### 1-3 환경설정

  # lombok 설치 

    maven repository에서 lombok 검색하여 pom.xml에 추가 
  
    Maven Dependencies에 업데이트 됨
  

  # Maven Dependencies에 추가된 lombok 경로를 복사하여 
  
    cmd -> cd 경로 ( " dir/w  "입력하면 뭐가 있는지 보여진다.) -> java -jar lombok-1.18.20.jar(해당 버전)을 입력하여 lombok을 실행시켜준다.
  
    -> 실행된 lombok에서 Specify location 에서 이클립스가 설치된 경로를 찾아주고 설치(install/update)한다. 이제 롬복 기능을 사용할 수 있다.
  
  # 테스트로 Sample01~03 작성 print와 println, printf의 차이

  # class 파일을 열면 우리가 해석하기 어렵게 되어있다. -> 이걸 다시 우리가 보기 좋게 java파일로 보려면 디컴파일을 해야한다.

  # decompiler는 이클립스 마켓에서 Enhanced Class Decompiler를 설치해준다. 
    
    - > 재실행 후 컴파일러를 실행 설정을 해준다 . 우클릭하여  Open With -> Other -> Class Decompiler Viewer를 선택해준다. (Use it for all...선택)
   
=================================================================================================================================
