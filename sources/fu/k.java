package fu;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;

/* loaded from: classes2.dex */
public class k extends j {
    public static boolean d(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.f23371b;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        while (true) {
            boolean z10 = true;
            for (File file : new g(start, direction, null, null, null, 0, 32, null)) {
                if (file.delete() || !file.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static File e(File file) {
        int length;
        String file2;
        File file3;
        int z10;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter("image_cache", "relative");
        File relative = new File("image_cache");
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        Intrinsics.checkNotNullParameter(relative, "<this>");
        String path = relative.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        char c10 = File.separatorChar;
        int z11 = w.z(path, c10, 0, false, 4);
        if (z11 == 0) {
            if (path.length() > 1 && path.charAt(1) == c10 && (z10 = w.z(path, c10, 2, false, 4)) >= 0) {
                int z12 = w.z(path, c10, z10 + 1, false, 4);
                if (z12 >= 0) {
                    length = z12 + 1;
                } else {
                    length = path.length();
                }
            } else {
                return relative;
            }
        } else if (z11 > 0 && path.charAt(z11 - 1) == ':') {
            length = z11 + 1;
        } else {
            if (z11 == -1 && w.u(path, ':')) {
                length = path.length();
            }
            file2 = file.toString();
            Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
            if (file2.length() == 0 || w.u(file2, c10)) {
                file3 = new File(file2 + relative);
            } else {
                file3 = new File(file2 + c10 + relative);
            }
            return file3;
        }
        if (length > 0) {
            return relative;
        }
        file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
        if (file2.length() == 0) {
            file3 = new File(file2 + c10 + relative);
            return file3;
        }
        file3 = new File(file2 + relative);
        return file3;
    }
}
