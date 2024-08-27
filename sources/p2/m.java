package p2;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.Arrays;
import k7.i1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30588a = 3;

    /* renamed from: b, reason: collision with root package name */
    public int f30589b;

    /* renamed from: c, reason: collision with root package name */
    public int f30590c;

    /* renamed from: d, reason: collision with root package name */
    public int f30591d;

    /* renamed from: e, reason: collision with root package name */
    public Object f30592e;

    public m() {
    }

    public final void a(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.f30591d;
                int i13 = i12 * 2;
                Object obj = this.f30592e;
                if (((int[]) obj) == null) {
                    int[] iArr = new int[4];
                    this.f30592e = iArr;
                    Arrays.fill(iArr, -1);
                } else if (i13 >= ((int[]) obj).length) {
                    int[] iArr2 = (int[]) obj;
                    int[] iArr3 = new int[i12 * 4];
                    this.f30592e = iArr3;
                    System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                }
                Object obj2 = this.f30592e;
                ((int[]) obj2)[i13] = i10;
                ((int[]) obj2)[i13 + 1] = i11;
                this.f30591d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void b(RecyclerView recyclerView, boolean z10) {
        this.f30591d = 0;
        int[] iArr = (int[]) this.f30592e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        i1 i1Var = recyclerView.f2402n;
        if (recyclerView.f2400m != null && i1Var != null && i1Var.f22412i) {
            if (z10) {
                if (!recyclerView.f2384e.g()) {
                    i1Var.i(recyclerView.f2400m.a(), this);
                }
            } else if (!recyclerView.P()) {
                i1Var.h(this.f30589b, this.f30590c, recyclerView.f2424y0, this);
            }
            int i10 = this.f30591d;
            if (i10 > i1Var.f22413j) {
                i1Var.f22413j = i10;
                i1Var.f22414k = z10;
                recyclerView.f2382c.o();
            }
        }
    }

    public final int c() {
        return this.f30591d - this.f30590c;
    }

    public final eb.f d() {
        return ((eb.f[]) this.f30592e)[this.f30589b];
    }

    public final byte[][] e(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f30590c * i11, this.f30591d * i10);
        int i12 = this.f30590c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i12 - i13) - 1;
            eb.f fVar = ((eb.f[]) this.f30592e)[i13 / i11];
            int length = ((byte[]) fVar.f15309b).length * i10;
            byte[] bArr2 = new byte[length];
            for (int i15 = 0; i15 < length; i15++) {
                bArr2[i15] = ((byte[]) fVar.f15309b)[i15 / i10];
            }
            bArr[i14] = bArr2;
        }
        return bArr;
    }

    public final boolean f(int i10) {
        if (((int[]) this.f30592e) != null) {
            int i11 = this.f30591d * 2;
            for (int i12 = 0; i12 < i11; i12 += 2) {
                if (((int[]) this.f30592e)[i12] == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void g(xm.d dVar, um.k kVar) {
        int indexOf;
        ((bn.c) this.f30592e).f7148c.getClass();
        float max = Math.max(s0.g.f34069a, Math.min(1.0f, 1.0f));
        float lowestVisibleX = dVar.getLowestVisibleX();
        float highestVisibleX = dVar.getHighestVisibleX();
        um.i h10 = kVar.h(lowestVisibleX, Float.NaN, 2);
        um.i h11 = kVar.h(highestVisibleX, Float.NaN, 1);
        int i10 = 0;
        if (h10 == null) {
            indexOf = 0;
        } else {
            indexOf = kVar.f37272p.indexOf(h10);
        }
        this.f30589b = indexOf;
        if (h11 != null) {
            i10 = kVar.f37272p.indexOf(h11);
        }
        this.f30590c = i10;
        this.f30591d = (int) ((i10 - this.f30589b) * max);
    }

    public final String toString() {
        switch (this.f30588a) {
            case 0:
                return HttpUrl.FRAGMENT_ENCODE_SET;
            default:
                return super.toString();
        }
    }

    public m(int i10, int i11) {
        this.f30592e = new eb.f[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            ((eb.f[]) this.f30592e)[i12] = new eb.f(((i11 + 4) * 17) + 1, 9);
        }
        this.f30591d = i11 * 17;
        this.f30590c = i10;
        this.f30589b = -1;
    }

    public m(char[] cArr, int i10, int i11) {
        this.f30589b = cArr.length;
        this.f30592e = cArr;
        this.f30590c = i10;
        this.f30591d = i11;
    }

    public m(bn.c cVar) {
        this.f30592e = cVar;
    }

    public m(int i10) {
        this.f30589b = i10;
    }

    public m(int i10, int i11, int i12, SparseArray sparseArray) {
        this.f30589b = i10;
        this.f30590c = i11;
        this.f30591d = i12;
        this.f30592e = sparseArray;
    }
}
