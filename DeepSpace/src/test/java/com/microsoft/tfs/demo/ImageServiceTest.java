/**
 * ------------------------------------------ START OF LICENSE -----------------------------------------
 *
 * Deep-Space
 *
 * Copyright (c) Microsoft Corporation
 *
 * All rights reserved.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the ""Software""), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * ----------------------------------------------- END OF LICENSE ------------------------------------------
 */
package com.microsoft.tfs.demo;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

//import static org.junit.Assert.*;
// Listed separately
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;


public class ImageServiceTest {

    private ImageService underTest;

    @Before
    public void setUp() {
        this.underTest = new ImageService();
    }

    @Test
    public void testGetImages() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetImages1() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun1() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter1() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn1() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth1() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun1() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter1() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn1() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth1() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent1() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }
    
    @Test
    public void testGetImages2() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun2() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter2() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn2() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth2() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun2() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter2() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn2() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth2() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent2() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetImages3() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun3() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter3() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn3() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth3() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun3() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter3() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn3() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth3() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent3() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetImages4() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun4() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter4() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn4() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth4() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun4() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter4() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn4() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth4() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent4() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetImages5() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun5() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter5() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn5() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth5() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun5() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter5() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn5() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth5() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent5() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetImages6() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun6() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter6() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn6() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth6() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun6() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter6() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn6() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth6() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent6() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetImages7() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun7() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter7() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn7() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth7() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun7() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter7() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn7() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth7() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent7() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetImages8() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun8() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter8() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn8() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth8() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun8() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter8() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn8() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth8() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent8() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetImages9() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        //assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun9() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter9() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn9() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth9() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun9() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter9() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn9() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth9() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent9() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }

    @Test
    public void testGetSun() {
        List<Image> images = this.underTest.getImages();
        assertNotNull(images);

        // Only have one of the two lines below uncommented one at a time
        //assertEquals(3, images.size());   // Leave this line in for no Earth
        assertEquals(4, images.size()); // Uncomment this line for Earth
    }

    @Test
    public void testGetImagesSun10() {
        List<Image> images = this.underTest.getImages();
        Image sun = getByName(images, "sun.png");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void testGetImagesJupiter10() {
        List<Image> images = this.underTest.getImages();
        Image jupiter = getByName(images, "jupiter.png");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void testGetImagesSaturn10() {
        List<Image> images = this.underTest.getImages();
        Image saturn = getByName(images, "saturn.png");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void testGetImagesEarth10() {
        // Uncomment the following test when Earth is added
        /*
        List<Image> images = this.underTest.getImages();
        Image earth = getByName(images, "earth.png");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameSun10() {
        Image sun = this.underTest.getByName("sun");
        assertEquals(660, sun.getWidth());
        assertEquals(660, sun.getHeight());
    }

    @Test
    public void getGetByNameJupiter10() {
        Image jupiter = this.underTest.getByName("jupiter");
        assertEquals(512, jupiter.getWidth());
        assertEquals(512, jupiter.getHeight());
    }

    @Test
    public void getGetByNameSaturn10() {
        Image saturn = this.underTest.getByName("saturn");
        assertEquals(1206, saturn.getWidth());
        assertEquals(690, saturn.getHeight());
    }

    @Test
    public void getGetByNameEarth10() {
        // Uncomment the following test when Earth is added
        /*
        Image earth = this.underTest.getByName("earth");
        assertEquals(512, earth.getWidth());
        assertEquals(512, earth.getHeight());
        */
    }

    @Test
    public void getGetByNameNonExistent10() {
        Image nonExistent = this.underTest.getByName("nonexistent");
        assertNull(nonExistent);
    }    

    private Image getByName(List<Image> images, String name) {
        if (images != null) {
            for (Image i : images) {
                if (i.getSrc().endsWith(name)) {
                    return i;
                }
            }
        }
        return null;
    }
}
