#include <conio.h>
#include <graphics.h>
#include <stdio.h>

int main()
{
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\\turboc3\\bgi");
	setfillstyle(SOLID_FILL, CYAN);
	circle(300, 150, 100);

	circle(300, 162, 88);
	floodfill(302, 52, 15);
	setfillstyle(SOLID_FILL, CYAN);

	// Body
	circle(300, 350, 100);
	circle(300, 338, 88);
	floodfill(302, 448, 15);
	setfillstyle(SOLID_FILL, RED);
	// NOSE
	circle(302, 164, 10);
	floodfill(304, 166, 15);

	//Eyes
	circle(260, 120, 15);//l
	circle(340, 120, 15);//r

	//Mustache 
	line(230, 164, 180, 164);//l
	line(230, 164, 180, 146);
	line(230, 164, 180, 184);
	line(370, 164, 420, 164);//r
	line(370, 164, 420, 146);
	line(370, 164, 420, 184);
	line(302, 174, 302, 190);
	line(265, 190, 335, 190);
	line(265, 190, 302, 210);
	line(302, 210, 335, 190);

	setfillstyle(SOLID_FILL, CYAN);
	//hand
	line(300, 250, 450, 270);//r
	line(300, 250, 450, 290);
	line(450, 270, 450, 290);
	floodfill(445, 282, 15);
	setfillstyle(SOLID_FILL, CYAN);
	line(300, 250, 150, 270);//l
	line(300, 250, 150, 290);
	line(150, 270, 150, 290);
	floodfill(155, 282, 15);
	circle(465, 281, 15);
	circle(135, 281, 15);
	// Pocket
	line(245, 330, 355, 330);
	line(245, 330, 300, 370);
	line(300, 370, 355, 330);
	setfillstyle(SOLID_FILL, RED);
	line(230, 248, 370, 248);
	line(230, 258, 370, 258);
	line(230, 248, 230, 258);
	line(370, 248, 370, 258);
	floodfill(232, 252, 15);
	floodfill(368, 252, 15);
	floodfill(300, 257, 15);
	setfillstyle(SOLID_FILL,YELLOW);

	// Bell
	circle(300, 273, 15);
	floodfill(302, 275, 15);
	setcolor(BLACK);
	line(285, 273, 315, 273);
	line(285, 278, 315, 278);
	setcolor(WHITE);


	circle(250,460,20);
   	circle(350,460,20);
	setcolor(BLUE);
	getch();
	closegraph();
	return 0;
}
