# 버스 어플리케이션

## 1. 개요

### 1.1. 목적
본 프로그램은 버스 시간표와 학교 지도 정보를 제공하는 애플리케이션입니다. 사용자는 버스 시간표를 조회하고, 특정 시간에 가까운 버스 출발 시간을 확인하거나, 학교 지도를 통해 특정 위치를 확인할 수 있습니다. 또한, CSV 파일을 통해 버스 시간표를 로드하고, 해당 데이터를 기반으로 사용자에게 정보를 제공합니다.

### 1.2. 대상
이 프로그램은 학교 버스를 이용하는 학생들 및 교직원을 대상으로 하며, 시간표와 학교 지도를 통해 이동 정보를 얻고자 하는 사람들을 위한 도구입니다. 프로그램은 자바 기반의 GUI 애플리케이션으로, 학교 버스의 시간표와 학교 내부 지도에 대한 정보를 제공합니다.

---

## 2. 프로그램의 중요성 및 필요성

### 2.1. 중요성
학교 내 버스 운행 정보는 학생들과 교직원들이 시간에 맞춰 버스를 이용할 수 있도록 도와주는 중요한 정보입니다. 특히, 학교 규모가 크거나 버스의 운행 시간이 제한된 경우, 실시간으로 필요한 정보를 빠르게 확인할 수 있어야 합니다. 이 프로그램은 사용자가 손쉽게 버스 시간을 확인하고, 학교 지도를 통해 목적지까지의 이동을 시각적으로 파악할 수 있도록 도와줍니다.

### 2.2. 필요성
본 프로그램은 학교 내 버스 이용자들이 버스 시간표를 보다 쉽게 확인하고, 자신의 위치에 맞는 버스를 찾을 수 있도록 돕습니다. 또한, 학교 지도를 제공하여 사용자가 학교 내 위치를 쉽게 파악할 수 있도록 지원하며, 이 정보는 학생들의 이동 편의성을 크게 향상시킬 수 있습니다. 따라서, 이 프로그램은 학교 커뮤니티 내에서 교통 정보에 대한 접근성을 높이는 데 기여할 수 있습니다.

---

## 3. 프로그램 수행 절차

### 3.1. 다이어그램
- 다이어그램은 도표, 타이밍 다이어그램, 순서도 등으로 프로그램의 전체 흐름을 나타냅니다.

### 3.2. 클래스 다이어그램
- ![스크린샷 2024-12-25 151053](https://github.com/user-attachments/assets/486fee40-ef8e-457f-ac9d-fb8bd119d46f)




### 3.3. 절차 설명
- 프로그램의 실행 절차는 다음과 같습니다:
  1. 첫 번째 화면에서 사용자가 CSV 파일 경로를 입력합니다.
  2. 파일을 로드하여 버스 시간표 데이터를 읽고, 두 번째 화면으로 이동합니다.
  3. 두 번째 화면에서는 사용자에게 버스 시간을 조회할 수 있는 기능을 제공합니다.
  4. 사용자가 입력한 시간에 가까운 버스 출발 시간을 확인할 수 있습니다.
  5. 세 번째 화면에서는 전체 버스 시간표를 확인할 수 있으며, 네 번째 화면에서는 학교 지도를 제공합니다.
  6. 각 화면에서 제공되는 버튼을 통해 사용자가 원하는 정보를 선택할 수 있습니다.

---

## 4. 느낀점
1학년때 html수업에 활용한 내용으로 해당 버스 사이트를 만들어보고 이번 자바 수업을 통해 기능적인 면을 구현할 수 있다 생각하여 관심을 기울여 만들었습니다. 원하는 목표는 각 정거장마다 버스가 몇 전 정도 남았는지 알아보고 즐겨찾기로 원히는 정류소의 정보를 추가한 후 지도로 시각적이게 위치를 검색하거나 타이틀 검색을 통해 알아보는 형식을 원했습니다. 하지만 아직 실력이 부족하여 기본적인 틀인 현재 입력된 시간을 토대로 앞으로 남은 시간과 몇시에 버스가 출발하는지 정도로 그쳤습니다. 만약 위 내용을 전부 완수한다면 위치 기반 서비스를 통해 버스의 실시간적인 위치를 입력하게 해 현재 대중적인 버스 앱처럼 만들고 싶었습니다.
