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
- [Uploading 기말 클<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36" version="25.0.3">
  <diagram name="페이지-1" id="YZPJuzBNVFTLOIfLBQUq">
    <mxGraphModel dx="2420" dy="755" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="B1pAFSpew6jwpooPruJS-15" value="Final_Bus_App" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="260" y="300" width="160" height="268" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-21" value="+ frame : JFrame" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-22" value="+ cardPanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="52" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-16" value="+ timeSchedule : HashMap" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="78" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-29" value="+ firstPanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="104" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-31" value="+ secondPanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="130" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-30" value="+ thirdPanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="156" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-32" value="+ fourthPanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="182" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-17" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="208" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-18" value="+ createAndShowGUI : void" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="216" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-23" value="+ main : void" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-15">
          <mxGeometry y="242" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-24" value="thirdPanel" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry y="482" width="160" height="242" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-25" value="+ BusTitle : JTextField" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-101" value="+ Font" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="52" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-102" value="+ BusCell : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="78" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-105" value="+ JLabel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="104" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-104" value="+ centerpanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="130" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-103" value="+ northpanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="156" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-106" value="+ out : JButton" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="182" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-26" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="208" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-27" value="+ actionPerformed : void" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-24">
          <mxGeometry y="216" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-33" value="&lt;span style=&quot;text-align: left;&quot;&gt;secondPanel&lt;/span&gt;" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry y="40" width="160" height="398" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-76" value="+ menuBar : JMenuBar" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-86" value="+ watch : JMenu" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="52" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-75" value="+ item1 : JMenuItem" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="78" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-74" value="+ item2 : JMenuItem" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="104" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-82" value="+ borderPanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="130" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-81" value="+ newpanel : JPanel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="156" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-80" value="+ title2 : JLabel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="182" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-79" value="+ title3 : JLabel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="208" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-78" value="+ title4 : JLabel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="234" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-77" value="+ font2 : Font" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="260" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-83" value="+ text2 : JTextField" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="286" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-85" value="+ search2 : JButton" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="312" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-84" value="+ textarea : JTextArea" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="338" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-35" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="364" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-36" value="+ actionPerformed : void" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-33">
          <mxGeometry y="372" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-71" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="B1pAFSpew6jwpooPruJS-41" target="B1pAFSpew6jwpooPruJS-29">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-41" value="firstPanel" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="510" y="270" width="160" height="164" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-42" value="+ title : JTextField" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-41">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-45" value="+ font : Font" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-41">
          <mxGeometry y="52" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-46" value="+ text1 : JTextField" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-41">
          <mxGeometry y="78" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-47" value="+ search1 : JButton" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-41">
          <mxGeometry y="104" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-43" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="B1pAFSpew6jwpooPruJS-41">
          <mxGeometry y="130" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-44" value="+ actionPerformed : void" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-41">
          <mxGeometry y="138" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-92" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="B1pAFSpew6jwpooPruJS-49" target="B1pAFSpew6jwpooPruJS-44">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-49" value="Anonymous(search1)" style="swimlane;fontStyle=0;childLayout=stackLayout;horizontal=1;startSize=26;fillColor=none;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="800" y="340" width="140" height="130" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-50" value="+ line : String" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-49">
          <mxGeometry y="26" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-51" value="&lt;font style=&quot;font-size: 11px;&quot;&gt;+ token : StringTokenizer&lt;/font&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-49">
          <mxGeometry y="52" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-52" value="+ time : int" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-49">
          <mxGeometry y="78" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-56" value="&lt;font style=&quot;font-size: 9px;&quot;&gt;+ intervals : ArrayList&amp;lt;Integer&amp;gt;&lt;/font&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-49">
          <mxGeometry y="104" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-72" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="B1pAFSpew6jwpooPruJS-62" target="B1pAFSpew6jwpooPruJS-32">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-62" value="fourthPanel" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="510" y="466" width="160" height="216" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-63" value="&lt;span style=&quot;font-size: 9px;&quot;&gt;+ layeredPane : JLayeredPane&lt;/span&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-62">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-67" value="+ school : ImageIcon" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-62">
          <mxGeometry y="52" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-66" value="+ schoolLabel : JLabel" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-62">
          <mxGeometry y="78" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-68" value="+ out2 : JButton" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-62">
          <mxGeometry y="104" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-69" value="+ place0 : JButton" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-62">
          <mxGeometry y="130" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-70" value="... +place5 : JButton" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-62">
          <mxGeometry y="156" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-64" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="B1pAFSpew6jwpooPruJS-62">
          <mxGeometry y="182" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-65" value="+ actionPerformed : void" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-62">
          <mxGeometry y="190" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-87" value="Anonymous(search2)" style="swimlane;fontStyle=0;childLayout=stackLayout;horizontal=1;startSize=26;fillColor=none;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-270" y="148" width="140" height="286" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-88" value="+ inputTimeStr : String" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="26" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-89" value="&lt;font style=&quot;font-size: 11px;&quot;&gt;+ timeParts : String[]&lt;/font&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="52" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-90" value="+ inputHour : int" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="78" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-93" value="+ inputMinute : int" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="104" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-91" value="&lt;font size=&quot;1&quot;&gt;+ inputTimeInMinues : int&lt;/font&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="130" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-97" value="&lt;font style=&quot;font-size: 10px;&quot;&gt;+ closestTimeInMinutes : int&lt;/font&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="156" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-96" value="+ minDifference : int" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="182" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-95" value="&lt;span style=&quot;font-size: 9px;&quot;&gt;+ intervals : ArrayList&amp;lt;Integer&amp;gt;&lt;/span&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="208" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-94" value="&lt;font style=&quot;font-size: 11px;&quot;&gt;+ busTimeInMinutes : int&lt;/font&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="234" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-98" value="+ difference : int" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="B1pAFSpew6jwpooPruJS-87">
          <mxGeometry y="260" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-99" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="B1pAFSpew6jwpooPruJS-91" target="B1pAFSpew6jwpooPruJS-36">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-100" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="B1pAFSpew6jwpooPruJS-80" target="B1pAFSpew6jwpooPruJS-31">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="B1pAFSpew6jwpooPruJS-107" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="B1pAFSpew6jwpooPruJS-105" target="B1pAFSpew6jwpooPruJS-30">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
래스 다이어그램.drawio…]()



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
