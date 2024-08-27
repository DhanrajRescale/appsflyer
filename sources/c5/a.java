package c5;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import lp.j1;
import lp.o0;
import yk.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f7947a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7948b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f7949c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f7950d;

    public a(j1 j1Var) {
        this.f7947a = j1Var;
        b bVar = b.f7951e;
        this.f7950d = false;
    }

    public final b a(b bVar) {
        if (!bVar.equals(b.f7951e)) {
            int i10 = 0;
            while (true) {
                o0 o0Var = this.f7947a;
                if (i10 < o0Var.size()) {
                    c cVar = (c) o0Var.get(i10);
                    b e10 = cVar.e(bVar);
                    if (cVar.b()) {
                        j.H0(!e10.equals(b.f7951e));
                        bVar = e10;
                    }
                    i10++;
                } else {
                    return bVar;
                }
            }
        } else {
            throw new AudioProcessor$UnhandledAudioFormatException(bVar);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f7948b;
        arrayList.clear();
        this.f7950d = false;
        int i10 = 0;
        while (true) {
            o0 o0Var = this.f7947a;
            if (i10 >= o0Var.size()) {
                break;
            }
            c cVar = (c) o0Var.get(i10);
            cVar.flush();
            if (cVar.b()) {
                arrayList.add(cVar);
            }
            i10++;
        }
        this.f7949c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f7949c[i11] = ((c) arrayList.get(i11)).c();
        }
    }

    public final int c() {
        return this.f7949c.length - 1;
    }

    public final boolean d() {
        if (this.f7950d && ((c) this.f7948b.get(c())).g() && !this.f7949c[c()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return !this.f7948b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        o0 o0Var = this.f7947a;
        if (o0Var.size() != aVar.f7947a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < o0Var.size(); i10++) {
            if (o0Var.get(i10) != aVar.f7947a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f7949c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f7948b;
                    c cVar = (c) arrayList.get(i10);
                    if (cVar.g()) {
                        if (!this.f7949c[i10].hasRemaining() && i10 < c()) {
                            ((c) arrayList.get(i10 + 1)).f();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.f7949c[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = c.f7956a;
                        }
                        long remaining = byteBuffer2.remaining();
                        cVar.d(byteBuffer2);
                        this.f7949c[i10] = cVar.c();
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.f7949c[i10].hasRemaining()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        z10 |= z11;
                    }
                }
            }
        } while (z10);
    }

    public final void g() {
        int i10 = 0;
        while (true) {
            o0 o0Var = this.f7947a;
            if (i10 < o0Var.size()) {
                c cVar = (c) o0Var.get(i10);
                cVar.flush();
                cVar.h();
                i10++;
            } else {
                this.f7949c = new ByteBuffer[0];
                b bVar = b.f7951e;
                this.f7950d = false;
                return;
            }
        }
    }

    public final int hashCode() {
        return this.f7947a.hashCode();
    }
}
