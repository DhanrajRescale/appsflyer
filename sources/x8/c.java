package x8;

import kotlin.text.s;
import okhttp3.Headers;

/* loaded from: classes.dex */
public abstract class c {
    public static Headers a(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String name = headers.name(i10);
            String value = headers.value(i10);
            if ((!s.j("Warning", name, true) || !s.r(value, "1", false)) && (s.j("Content-Length", name, true) || s.j("Content-Encoding", name, true) || s.j("Content-Type", name, true) || !b(name) || headers2.get(name) == null)) {
                builder.addUnsafeNonAscii(name, value);
            }
        }
        int size2 = headers2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String name2 = headers2.name(i11);
            if (!s.j("Content-Length", name2, true) && !s.j("Content-Encoding", name2, true) && !s.j("Content-Type", name2, true) && b(name2)) {
                builder.addUnsafeNonAscii(name2, headers2.value(i11));
            }
        }
        return builder.build();
    }

    public static boolean b(String str) {
        if (!s.j("Connection", str, true) && !s.j("Keep-Alive", str, true) && !s.j("Proxy-Authenticate", str, true) && !s.j("Proxy-Authorization", str, true) && !s.j("TE", str, true) && !s.j("Trailers", str, true) && !s.j("Transfer-Encoding", str, true) && !s.j("Upgrade", str, true)) {
            return true;
        }
        return false;
    }
}
