package or;

import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f30263a;

    /* renamed from: b, reason: collision with root package name */
    public f f30264b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f30265c;

    /* renamed from: d, reason: collision with root package name */
    public int f30266d;

    /* renamed from: e, reason: collision with root package name */
    public int f30267e;

    /* renamed from: f, reason: collision with root package name */
    public e f30268f;

    /* renamed from: g, reason: collision with root package name */
    public int f30269g;

    public c(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f30263a = sb2.toString();
        this.f30264b = f.f30283a;
        this.f30265c = new StringBuilder(str.length());
        this.f30267e = -1;
    }

    public final char a() {
        return this.f30263a.charAt(this.f30266d);
    }

    public final boolean b() {
        if (this.f30266d < this.f30263a.length() - this.f30269g) {
            return true;
        }
        return false;
    }

    public final void c(int i10) {
        e eVar = this.f30268f;
        if (eVar == null || i10 > eVar.f30276b) {
            this.f30268f = e.e(i10, this.f30264b);
        }
    }

    public final void d(char c10) {
        this.f30265c.append(c10);
    }
}
