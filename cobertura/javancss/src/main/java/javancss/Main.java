//COBERTURA EXCLUDE THIS FILE
/*
Copyright (C) 2000 Chr. Clemens Lee <clemens@kclee.com>.

This file is part of JavaNCSS
(http://www.kclee.com/clemens/java/javancss/).

JavaNCSS is free software; you can redistribute it and/or modify it
under the terms of the GNU General Public License as published by the
Free Software Foundation; either version 2, or (at your option) any
later version.

JavaNCSS is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License
along with JavaNCSS; see the file COPYING.  If not, write to
the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA 02111-1307, USA.  */

package javancss;

import java.io.IOException;
import java.util.Locale;

/**
 * Main class of the JavaNCSS application. It does nothing
 * than starting the batch process and immediately delegates
 * control to the Javancss class.
 *
 * @author    Chr. Clemens Lee <clemens@kclee.com>
 * @version   $Id: Main.java 151 2009-05-22 21:41:33Z hboutemy $
 */
public class Main {
    private static final String IMPL_VERSION = Main.class.getPackage().getImplementationVersion();
    public static final String S_RCS_HEADER = "$Header: /javancss/Main.java,v "
        + ((IMPL_VERSION == null) ? "0.0 2001/01/01 00:00:00" : IMPL_VERSION) + " clemens Exp clemens $";

    public static void main(String[] asArgs) throws IOException {
        Locale.setDefault( Locale.US );

        Javancss pJavancss = new Javancss(asArgs);

        if (pJavancss.getLastErrorMessage() != null) {
            System.exit(1);
        }

        System.exit(0);
    }
}
