package c5;

import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f7951e = new b(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f7952a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7954c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7955d;

    public b(int i10, int i11, int i12) {
        int i13;
        this.f7952a = i10;
        this.f7953b = i11;
        this.f7954c = i12;
        if (x.D(i12)) {
            i13 = x.u(i12, i11);
        } else {
            i13 = -1;
        }
        this.f7955d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7952a == bVar.f7952a && this.f7953b == bVar.f7953b && this.f7954c == bVar.f7954c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7952a), Integer.valueOf(this.f7953b), Integer.valueOf(this.f7954c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f7952a);
        sb2.append(", channelCount=");
        sb2.append(this.f7953b);
        sb2.append(", encoding=");
        return a3.a.i(sb2, this.f7954c, ']');
    }
}
