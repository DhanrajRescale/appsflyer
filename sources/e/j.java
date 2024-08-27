package e;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import e5.p;
import e5.u;
import e5.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m3.n;
import q6.r;
import z5.q;

/* loaded from: classes.dex */
public final class j implements z5.h {

    /* renamed from: a, reason: collision with root package name */
    public int f14632a;

    /* renamed from: b, reason: collision with root package name */
    public int f14633b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14634c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14635d;

    public j() {
        this(10, 4);
    }

    public final synchronized void a(long j10, Object obj) {
        if (this.f14633b > 0) {
            if (j10 <= ((long[]) this.f14634c)[((this.f14632a + r0) - 1) % ((Object[]) this.f14635d).length]) {
                b();
            }
        }
        c();
        int i10 = this.f14632a;
        int i11 = this.f14633b;
        Object obj2 = this.f14635d;
        int length = (i10 + i11) % ((Object[]) obj2).length;
        ((long[]) this.f14634c)[length] = j10;
        ((Object[]) obj2)[length] = obj;
        this.f14633b = i11 + 1;
    }

    public final synchronized void b() {
        this.f14632a = 0;
        this.f14633b = 0;
        Arrays.fill((Object[]) this.f14635d, (Object) null);
    }

    public final void c() {
        int length = ((Object[]) this.f14635d).length;
        if (this.f14633b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f14632a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f14634c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.f14635d, this.f14632a, objArr, 0, i12);
        int i13 = this.f14632a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f14634c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.f14635d, 0, objArr, i12, this.f14632a);
        }
        this.f14634c = jArr;
        this.f14635d = objArr;
        this.f14632a = 0;
    }

    public final boolean d(int i10, int i11) {
        if (((byte[]) this.f14635d)[(i11 * this.f14633b) + i10] >= 0) {
            return true;
        }
        return false;
    }

    @Override // z5.h
    public final void e() {
        p pVar = (p) this.f14635d;
        byte[] bArr = x.f15055f;
        pVar.getClass();
        pVar.D(bArr.length, bArr);
    }

    public final void f(int i10) {
        Object obj;
        Object obj2 = this.f14634c;
        if (((es.b[]) obj2) == null || ((es.b[]) obj2).length != i10) {
            if (((es.b[]) obj2) != null) {
                for (es.b bVar : (es.b[]) obj2) {
                    ((List) this.f14635d).add(new WeakReference(bVar));
                }
            }
            es.b[] bVarArr = new es.b[i10];
            this.f14634c = bVarArr;
            int length = bVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                Object[] objArr = (es.b[]) this.f14634c;
                if (objArr[i11] == null) {
                    Iterator it = ((List) this.f14635d).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = (es.b) ((WeakReference) it.next()).get();
                            it.remove();
                            if (obj != null) {
                                break;
                            }
                        } else {
                            obj = new Object();
                            break;
                        }
                    }
                    objArr[i11] = obj;
                }
            }
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f14632a;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        if (i11 < 0) {
            int i15 = this.f14633b;
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        int i16 = 1;
        if ((((CharSequence) this.f14634c).charAt(i12) & (1 << (8 - i13))) == 0) {
            i16 = 0;
        }
        ((byte[]) this.f14635d)[(i10 * this.f14633b) + i11] = (byte) i16;
    }

    @Override // z5.h
    public final z5.g h(q qVar, long j10) {
        long position = qVar.getPosition();
        int min = (int) Math.min(this.f14633b, qVar.f() - position);
        ((p) this.f14635d).C(min);
        qVar.n(((p) this.f14635d).f15036a, 0, min);
        p pVar = (p) this.f14635d;
        int i10 = pVar.f15038c;
        long j11 = -1;
        long j12 = -1;
        long j13 = -9223372036854775807L;
        while (pVar.a() >= 188) {
            byte[] bArr = pVar.f15036a;
            int i11 = pVar.f15037b;
            while (i11 < i10 && bArr[i11] != 71) {
                i11++;
            }
            int i12 = i11 + 188;
            if (i12 > i10) {
                break;
            }
            long R = yk.g.R(i11, this.f14632a, pVar);
            if (R != -9223372036854775807L) {
                long b10 = ((u) this.f14634c).b(R);
                if (b10 > j10) {
                    if (j13 == -9223372036854775807L) {
                        return new z5.g(-1, b10, position);
                    }
                    return new z5.g(0, -9223372036854775807L, position + j12);
                }
                if (100000 + b10 > j10) {
                    return new z5.g(0, -9223372036854775807L, position + i11);
                }
                j13 = b10;
                j12 = i11;
            }
            pVar.F(i12);
            j11 = i12;
        }
        if (j13 != -9223372036854775807L) {
            return new z5.g(-2, j13, position + j11);
        }
        return z5.g.f42082d;
    }

    public final Object i(long j10, boolean z10) {
        Object obj = null;
        long j11 = Long.MAX_VALUE;
        while (this.f14633b > 0) {
            long j12 = j10 - ((long[]) this.f14634c)[this.f14632a];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            obj = j();
            j11 = j12;
        }
        return obj;
    }

    public final Object j() {
        boolean z10;
        if (this.f14633b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        Object obj = this.f14635d;
        int i10 = this.f14632a;
        Object obj2 = ((Object[]) obj)[i10];
        ((Object[]) obj)[i10] = null;
        this.f14632a = (i10 + 1) % ((Object[]) obj).length;
        this.f14633b--;
        return obj2;
    }

    public final void k(int i10, float f10, int i11) {
        es.b bVar = ((es.b[]) this.f14634c)[i10];
        bVar.f15862a = i11;
        bVar.f15863b = f10;
    }

    public final void l(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        g(i13, i14, i12, 1);
        int i15 = i11 - 1;
        g(i13, i15, i12, 2);
        int i16 = i10 - 1;
        g(i16, i14, i12, 3);
        g(i16, i15, i12, 4);
        g(i16, i11, i12, 5);
        g(i10, i14, i12, 6);
        g(i10, i15, i12, 7);
        g(i10, i11, i12, 8);
    }

    public j(int i10, int i11) {
        if (i11 == 7) {
            this.f14634c = new r[i10];
            this.f14633b = 0;
            return;
        }
        if (i11 == 11) {
            this.f14635d = new ArrayList();
            this.f14632a = i10;
        } else if (i11 != 12) {
            this.f14634c = new long[i10];
            this.f14635d = new Object[i10];
        } else {
            this.f14632a = i10;
            Object[] objArr = new Object[i10 + 1];
            this.f14634c = objArr;
            this.f14635d = objArr;
        }
    }

    public j(Context context, XmlResourceParser xmlResourceParser) {
        this.f14634c = new ArrayList();
        this.f14633b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), m3.r.f27463h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f14632a = obtainStyledAttributes.getResourceId(index, this.f14632a);
            } else if (index == 1) {
                this.f14633b = obtainStyledAttributes.getResourceId(index, this.f14633b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f14633b);
                context.getResources().getResourceName(this.f14633b);
                if ("layout".equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f14635d = nVar;
                    nVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f14633b, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public j(int i10, int i11, float[] fArr, float[] fArr2) {
        this.f14632a = i10;
        yk.j.E0(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f14634c = fArr;
        this.f14635d = fArr2;
        this.f14633b = i11;
    }

    public j(j jVar) {
        Object obj = jVar.f14634c;
        this.f14632a = ((float[]) obj).length / 3;
        this.f14634c = e5.a.h((float[]) obj);
        this.f14635d = e5.a.h((float[]) jVar.f14635d);
        int i10 = jVar.f14633b;
        if (i10 == 1) {
            this.f14633b = 5;
        } else if (i10 != 2) {
            this.f14633b = 4;
        } else {
            this.f14633b = 6;
        }
    }
}
