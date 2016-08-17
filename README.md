# TFG

## Instalacion de openCV en Ubuntu


1- Ejecutar 
```
sudo apt-get update
sudo apt-get upgrade
```

2- Ejecutar
```
sudo apt-get install build-essential libgtk2.0-dev libjpeg-dev libtiff4-dev libjasper-dev libopenexr-dev cmake python-dev python-numpy python-tk libtbb-dev libeigen3-dev yasm libfaac-dev libopencore-amrnb-dev libopencore-amrwb-dev libtheora-dev libvorbis-dev libxvidcore-dev libx264-dev libqt4-dev libqt4-opengl-dev sphinx-common texlive-latex-extra libv4l-dev libdc1394-22-dev libavcodec-dev libavformat-dev libswscale-dev default-jdk ant libvtk5-qt4-dev
```

3- Descargar y extraer openCV para linux (http://opencv.org/downloads.html)

4- En la carpeta donde extragimos el openCV (Tarda mucho): 
```
mkdir build
cd build
cmake -D WITH_TBB=ON -D BUILD_NEW_PYTHON_SUPPORT=ON -D WITH_V4L=ON -D INSTALL_C_EXAMPLES=ON -D INSTALL_PYTHON_EXAMPLES=ON -D BUILD_EXAMPLES=ON -D WITH_QT=ON -D WITH_OPENGL=ON -D WITH_VTK=ON ..
```

5- Ejecutar
```
make
sudo make install
```

6- Ejecutar
```
sudo gedit /etc/ld.so.conf.d/opencv.conf
```
y agregarle 
```
/usr/local/lib
```

7- Ejecutar
```
sudo ldconfig
```

8- Ejecutar 
```
sudo gedit /etc/bash.bashrc
```
y agregarle al final: 
```
PKG_CONFIG_PATH=$PKG_CONFIG_PATH:/usr/local/lib/pkgconfig
export PKG_CONFIG_PATH
```

9- Cerrar la consola y abrir una nueva.


## Test para verificar funcionamiento de openCV en Linux

1-
```
cd ~/opencv-2.4.9/samples/c
chmod +x build_all.sh
./build_all.sh
```

2-
```
./facedetect --cascade="/usr/local/share/OpenCV/haarcascades/haarcascade_frontalface_alt.xml" --nested-cascade="/usr/local/share/OpenCV/haarcascades/haarcascade_eye.xml" --scale=1.5 lena.jpg
```

## Integracion con Eclipse

1. Windows -> Preferences -> Java -> Build Path -> User Libraries
2. New -> Poner un nombre (Ej: opencv)
3. Seleccionar opencv -> Add external JARs
4. Poner el Jar ubicado en /usr/local/share/OpenCV/java
5. Seleccionar 'Native Library Location' dentro del Jar y presionar 'Edit'
6. Seleccionar 'External Folder...' y seleccionar la carpeta: /usr/local/share/OpenCV/java

## Integracion con proyecto

1. Crear proyecto
2. Segundo Click -> Build Path -> Add Library -> User Library -> Seleccionar nuestra libreria


## Test para verificar funcionamiento de openCV en Proyecto

1. examples/Example1 -> Run As -> Java Application
 








