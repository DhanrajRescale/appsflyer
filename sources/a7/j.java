package a7;

import androidx.media3.common.ParserException;
import e5.p;
import e5.x;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class j {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i10 = x.f15050a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            j11 += Long.parseLong(split[1]);
        }
        return j11 * 1000;
    }

    public static void c(p pVar) {
        int i10 = pVar.f15037b;
        Charset charset = kp.e.f23433c;
        String h10 = pVar.h(charset);
        if (h10 != null && h10.startsWith("WEBVTT")) {
            return;
        }
        pVar.F(i10);
        throw ParserException.a("Expected WEBVTT. Got " + pVar.h(charset), null);
    }
}
