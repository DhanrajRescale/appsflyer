package tr;

import android.content.res.TypedArray;
import android.graphics.Insets;
import android.net.Uri;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.work.a0;
import androidx.work.y;
import b5.d1;
import b5.v;
import b7.c0;
import b7.f0;
import b7.h0;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import e5.t;
import e5.u;
import e5.x;
import i5.a1;
import i5.d0;
import i5.f1;
import i5.u0;
import i5.v0;
import i5.w0;
import i5.x0;
import i5.z0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import k5.i;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l8.j;
import n5.m;
import okhttp3.HttpUrl;
import r5.b0;
import r5.n;
import r5.s;
import r5.w;
import t7.p;
import tu.k1;
import tu.l1;
import tu.q0;
import v5.q;
import z5.r;

/* loaded from: classes2.dex */
public final class e implements b0, m, q, z5.h, b7.b0, p7.e, y3.f, androidx.work.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36360a;

    /* renamed from: b, reason: collision with root package name */
    public Object f36361b;

    /* renamed from: c, reason: collision with root package name */
    public Object f36362c;

    public /* synthetic */ e(int i10, Object obj) {
        this.f36360a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005d), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bv.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tr.e y(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L5b
            bv.m[] r0 = new bv.m[r0]     // Catch: java.io.IOException -> L5b
            bv.j r1 = new bv.j     // Catch: java.io.IOException -> L5b
            r1.<init>()     // Catch: java.io.IOException -> L5b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L5b
            if (r3 >= r4) goto L5d
            r4 = r12[r3]     // Catch: java.io.IOException -> L5b
            java.lang.String[] r5 = v9.c.f37801e     // Catch: java.io.IOException -> L5b
            r6 = 34
            r1.b0(r6)     // Catch: java.io.IOException -> L5b
            int r7 = r4.length()     // Catch: java.io.IOException -> L5b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L5b
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L5b
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.i0(r9, r8, r4)     // Catch: java.io.IOException -> L5b
        L3d:
            r1.j0(r10)     // Catch: java.io.IOException -> L5b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.i0(r9, r7, r4)     // Catch: java.io.IOException -> L5b
        L4a:
            r1.b0(r6)     // Catch: java.io.IOException -> L5b
            r1.readByte()     // Catch: java.io.IOException -> L5b
            long r4 = r1.f7365b     // Catch: java.io.IOException -> L5b
            bv.m r4 = r1.e(r4)     // Catch: java.io.IOException -> L5b
            r0[r3] = r4     // Catch: java.io.IOException -> L5b
            int r3 = r3 + 1
            goto La
        L5b:
            r12 = move-exception
            goto L71
        L5d:
            tr.e r1 = new tr.e     // Catch: java.io.IOException -> L5b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L5b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L5b
            int r2 = bv.a0.f7319d     // Catch: java.io.IOException -> L5b
            bv.a0 r0 = de.d.n(r0)     // Catch: java.io.IOException -> L5b
            r2 = 28
            r1.<init>(r2, r12, r0)     // Catch: java.io.IOException -> L5b
            return r1
        L71:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tr.e.y(java.lang.String[]):tr.e");
    }

    public final void A(z3.f fVar) {
        int i10 = fVar.f41993b;
        if (i10 == 0) {
            ((Handler) this.f36362c).post(new z3.a(0, this, (hr.c) this.f36361b, fVar.f41992a));
        } else {
            ((Handler) this.f36362c).post(new b.d(this, (hr.c) this.f36361b, i10, 5));
        }
    }

    public final void B(Boolean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        k1 k1Var = (k1) ((q0) this.f36361b);
        k1Var.m(new Pair(Integer.valueOf(((Number) ((Pair) k1Var.getValue()).f23353a).intValue() + 1), data));
    }

    public final void C(int i10, int i11, int i12, int i13) {
        ((CardView) this.f36362c).f1156d.set(i10, i11, i12, i13);
        Object obj = this.f36362c;
        CardView.a((CardView) obj, i10 + ((CardView) obj).f1155c.left, i11 + ((CardView) obj).f1155c.top, i12 + ((CardView) obj).f1155c.right, i13 + ((CardView) obj).f1155c.bottom);
    }

    public final void D(vl.b bVar) {
        ((e0) this.f36361b).postValue(bVar);
        if (bVar instanceof a0) {
            ((j) this.f36362c).j((a0) bVar);
        } else if (bVar instanceof y) {
            ((j) this.f36362c).k(((y) bVar).f2645g);
        }
    }

    @Override // r5.b0
    public final void G(int i10, w wVar, n nVar, s sVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new v0(this, t10, nVar, sVar, 1));
        }
    }

    @Override // n5.m
    public final void I(int i10, w wVar, Exception exc) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new androidx.fragment.app.e(4, this, t10, exc));
        }
    }

    @Override // r5.b0
    public final void J(int i10, w wVar, n nVar, s sVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new v0(this, t10, nVar, sVar, 0));
        }
    }

    @Override // r5.b0
    public final void L(int i10, w wVar, s sVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new u0(this, t10, sVar, 0));
        }
    }

    @Override // r5.b0
    public final void M(int i10, w wVar, n nVar, s sVar, IOException iOException, boolean z10) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new x0(this, t10, nVar, sVar, iOException, z10, 0));
        }
    }

    @Override // y3.f
    public final void a() {
        ((p) this.f36361b).cancel();
    }

    @Override // b7.b0
    public final void b(e5.p pVar) {
        if (pVar.u() != 0 || (pVar.u() & 128) == 0) {
            return;
        }
        pVar.G(6);
        int a10 = pVar.a() / 4;
        for (int i10 = 0; i10 < a10; i10++) {
            b5.m mVar = (b5.m) this.f36361b;
            pVar.e(mVar.f3433b, 0, 4);
            mVar.p(0);
            int i11 = ((b5.m) this.f36361b).i(16);
            ((b5.m) this.f36361b).s(3);
            if (i11 == 0) {
                ((b5.m) this.f36361b).s(13);
            } else {
                int i12 = ((b5.m) this.f36361b).i(13);
                if (((f0) this.f36362c).f3842e.get(i12) == null) {
                    f0 f0Var = (f0) this.f36362c;
                    f0Var.f3842e.put(i12, new c0(new b7.e0(f0Var, i12)));
                    ((f0) this.f36362c).f3848k++;
                }
            }
        }
        f0 f0Var2 = (f0) this.f36362c;
        f0Var2.getClass();
        f0Var2.f3842e.remove(0);
    }

    @Override // b7.b0
    public final void c(u uVar, r rVar, h0 h0Var) {
    }

    @Override // n5.m
    public final void d(int i10, w wVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new w0(this, t10, 0));
        }
    }

    @Override // z5.h
    public final void e() {
        e5.p pVar = (e5.p) this.f36362c;
        byte[] bArr = x.f15055f;
        pVar.getClass();
        pVar.D(bArr.length, bArr);
    }

    public final boolean equals(Object obj) {
        switch (this.f36360a) {
            case 27:
                if (!(obj instanceof c4.d)) {
                    return false;
                }
                c4.d dVar = (c4.d) obj;
                Object obj2 = dVar.f7942a;
                Object obj3 = this.f36361b;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    return false;
                }
                Object obj4 = this.f36362c;
                Object obj5 = dVar.f7943b;
                if (obj5 != obj4 && (obj5 == null || !obj5.equals(obj4))) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    @Override // p7.e
    public final void f(q7.f fVar) {
        long j10;
        Object[] objArr = (Object[]) this.f36362c;
        if (objArr != null) {
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                if (obj == null) {
                    fVar.d(i10);
                } else if (obj instanceof byte[]) {
                    fVar.a(i10, (byte[]) obj);
                } else if (obj instanceof Float) {
                    fVar.b(i10, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    fVar.b(i10, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    fVar.c(i10, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    fVar.c(i10, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    fVar.c(i10, ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    fVar.c(i10, ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    fVar.f(i10, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j10 = 1;
                    } else {
                        j10 = 0;
                    }
                    fVar.c(i10, j10);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }

    @Override // n5.m
    public final void g(int i10, w wVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new w0(this, t10, 3));
        }
    }

    @Override // z5.h
    public final z5.g h(z5.q qVar, long j10) {
        z5.g gVar;
        long position = qVar.getPosition();
        int min = (int) Math.min(20000L, qVar.f() - position);
        ((e5.p) this.f36362c).C(min);
        qVar.n(((e5.p) this.f36362c).f15036a, 0, min);
        e5.p pVar = (e5.p) this.f36362c;
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (pVar.a() >= 4) {
            if (c6.a.d(pVar.f15037b, pVar.f15036a) != 442) {
                pVar.G(1);
            } else {
                pVar.G(4);
                long c10 = b7.y.c(pVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((u) this.f36361b).b(c10);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new z5.g(-1, b10, position);
                        }
                        gVar = new z5.g(0, -9223372036854775807L, position + i11);
                    } else if (100000 + b10 > j10) {
                        gVar = new z5.g(0, -9223372036854775807L, position + pVar.f15037b);
                    } else {
                        i11 = pVar.f15037b;
                        j11 = b10;
                    }
                    return gVar;
                }
                int i12 = pVar.f15038c;
                if (pVar.a() < 10) {
                    pVar.F(i12);
                } else {
                    pVar.G(9);
                    int u10 = pVar.u() & 7;
                    if (pVar.a() < u10) {
                        pVar.F(i12);
                    } else {
                        pVar.G(u10);
                        if (pVar.a() < 4) {
                            pVar.F(i12);
                        } else {
                            if (c6.a.d(pVar.f15037b, pVar.f15036a) == 443) {
                                pVar.G(4);
                                int z10 = pVar.z();
                                if (pVar.a() < z10) {
                                    pVar.F(i12);
                                } else {
                                    pVar.G(z10);
                                }
                            }
                            while (true) {
                                if (pVar.a() < 4) {
                                    break;
                                }
                                int d10 = c6.a.d(pVar.f15037b, pVar.f15036a);
                                if (d10 == 442 || d10 == 441 || (d10 >>> 8) != 1) {
                                    break;
                                }
                                pVar.G(4);
                                if (pVar.a() < 2) {
                                    pVar.F(i12);
                                    break;
                                }
                                pVar.F(Math.min(pVar.f15038c, pVar.f15037b + pVar.z()));
                            }
                        }
                    }
                }
                i10 = pVar.f15037b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new z5.g(-2, j11, position + i10);
        }
        return z5.g.f42082d;
    }

    public final int hashCode() {
        int hashCode;
        switch (this.f36360a) {
            case 27:
                Object obj = this.f36361b;
                int i10 = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                Object obj2 = this.f36362c;
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                return hashCode ^ i10;
            default:
                return super.hashCode();
        }
    }

    @Override // v5.q
    public final Object i(Uri uri, g5.g gVar) {
        long j10;
        m5.c cVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        q5.a aVar = (q5.a) ((q) this.f36361b).i(uri, gVar);
        List list = (List) this.f36362c;
        if (list != null && !list.isEmpty()) {
            List list2 = (List) this.f36362c;
            m5.c cVar2 = (m5.c) aVar;
            cVar2.getClass();
            LinkedList linkedList = new LinkedList(list2);
            Collections.sort(linkedList);
            linkedList.add(new d1(-1, -1, -1));
            ArrayList arrayList3 = new ArrayList();
            long j11 = 0;
            int i10 = 0;
            while (true) {
                j10 = -9223372036854775807L;
                if (i10 >= cVar2.f27525m.size()) {
                    break;
                }
                if (((d1) linkedList.peek()).f3256a != i10) {
                    long b10 = cVar2.b(i10);
                    if (b10 != -9223372036854775807L) {
                        j11 += b10;
                    }
                    cVar = cVar2;
                    arrayList2 = arrayList3;
                } else {
                    m5.h a10 = cVar2.a(i10);
                    List list3 = a10.f27549c;
                    d1 d1Var = (d1) linkedList.poll();
                    int i11 = d1Var.f3256a;
                    ArrayList arrayList4 = new ArrayList();
                    while (true) {
                        int i12 = d1Var.f3257b;
                        m5.a aVar2 = (m5.a) list3.get(i12);
                        List list4 = aVar2.f27505c;
                        ArrayList arrayList5 = new ArrayList();
                        do {
                            arrayList5.add((m5.m) list4.get(d1Var.f3258c));
                            d1Var = (d1) linkedList.poll();
                            if (d1Var.f3256a != i11) {
                                break;
                            }
                        } while (d1Var.f3257b == i12);
                        cVar = cVar2;
                        arrayList = arrayList3;
                        List list5 = list3;
                        arrayList4.add(new m5.a(aVar2.f27503a, aVar2.f27504b, arrayList5, aVar2.f27506d, aVar2.f27507e, aVar2.f27508f));
                        if (d1Var.f3256a != i11) {
                            break;
                        }
                        cVar2 = cVar;
                        arrayList3 = arrayList;
                        list3 = list5;
                    }
                    linkedList.addFirst(d1Var);
                    arrayList2 = arrayList;
                    arrayList2.add(new m5.h(a10.f27547a, a10.f27548b - j11, arrayList4, a10.f27550d));
                }
                i10++;
                arrayList3 = arrayList2;
                cVar2 = cVar;
            }
            m5.c cVar3 = cVar2;
            ArrayList arrayList6 = arrayList3;
            long j12 = cVar3.f27514b;
            if (j12 != -9223372036854775807L) {
                j10 = j12 - j11;
            }
            return new m5.c(cVar3.f27513a, j10, cVar3.f27515c, cVar3.f27516d, cVar3.f27517e, cVar3.f27518f, cVar3.f27519g, cVar3.f27520h, cVar3.f27524l, cVar3.f27521i, cVar3.f27522j, cVar3.f27523k, arrayList6);
        }
        return aVar;
    }

    @Override // n5.m
    public final void j(int i10, w wVar, int i11) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new defpackage.a(this, t10, i11, 2));
        }
    }

    @Override // n5.m
    public final void k(int i10, w wVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new w0(this, t10, 1));
        }
    }

    @Override // p7.e
    public final String l() {
        return (String) this.f36361b;
    }

    public final void m() {
        this.f36361b = null;
        this.f36362c = null;
    }

    public final boolean n(int i10) {
        return ((b5.t) this.f36361b).f3586a.get(i10);
    }

    @Override // r5.b0
    public final void o(int i10, w wVar, s sVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new u0(this, t10, sVar, 1));
        }
    }

    public final void p(r rVar, h0 h0Var) {
        boolean z10;
        for (int i10 = 0; i10 < ((z5.b0[]) this.f36362c).length; i10++) {
            h0Var.a();
            h0Var.b();
            z5.b0 f10 = rVar.f(h0Var.f3872d, 3);
            v vVar = (v) ((List) this.f36361b).get(i10);
            String str = vVar.f3652l;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            yk.j.F0(z10, "Invalid closed caption MIME type provided: " + str);
            String str2 = vVar.f3641a;
            if (str2 == null) {
                h0Var.b();
                str2 = h0Var.f3873e;
            }
            b5.u uVar = new b5.u();
            uVar.f3590a = str2;
            uVar.f3600k = str;
            uVar.f3593d = vVar.f3644d;
            uVar.f3592c = vVar.f3643c;
            uVar.C = vVar.D;
            uVar.f3602m = vVar.f3654n;
            f10.e(new v(uVar));
            ((z5.b0[]) this.f36362c)[i10] = f10;
        }
    }

    public final void q(i5.g gVar) {
        synchronized (gVar) {
        }
        Object obj = this.f36361b;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new i(this, gVar, 0));
        }
    }

    public final byte[] r(h6.a aVar) {
        ((ByteArrayOutputStream) this.f36361b).reset();
        try {
            DataOutputStream dataOutputStream = (DataOutputStream) this.f36362c;
            dataOutputStream.writeBytes(aVar.f18013a);
            dataOutputStream.writeByte(0);
            String str = aVar.f18014b;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            DataOutputStream dataOutputStream2 = (DataOutputStream) this.f36362c;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            ((DataOutputStream) this.f36362c).writeLong(aVar.f18015c);
            ((DataOutputStream) this.f36362c).writeLong(aVar.f18016d);
            ((DataOutputStream) this.f36362c).write(aVar.f18017e);
            ((DataOutputStream) this.f36362c).flush();
            return ((ByteArrayOutputStream) this.f36361b).toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // n5.m
    public final void s(int i10, w wVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new w0(this, t10, 2));
        }
    }

    public final android.util.Pair t(int i10, w wVar) {
        w wVar2;
        w wVar3 = null;
        if (wVar != null) {
            z0 z0Var = (z0) this.f36361b;
            int i11 = 0;
            while (true) {
                if (i11 < z0Var.f19681c.size()) {
                    if (((w) z0Var.f19681c.get(i11)).f3559d == wVar.f3559d) {
                        Object obj = z0Var.f19680b;
                        int i12 = f1.f19424k;
                        wVar2 = wVar.b(android.util.Pair.create(obj, wVar.f3556a));
                        break;
                    }
                    i11++;
                } else {
                    wVar2 = null;
                    break;
                }
            }
            if (wVar2 == null) {
                return null;
            }
            wVar3 = wVar2;
        }
        return android.util.Pair.create(Integer.valueOf(i10 + ((z0) this.f36361b).f19682d), wVar3);
    }

    public final String toString() {
        switch (this.f36360a) {
            case 7:
                return "Bounds{lower=" + ((u3.c) this.f36361b) + " upper=" + ((u3.c) this.f36362c) + UrlTreeKt.componentParamSuffix;
            case 27:
                return "Pair{" + this.f36361b + " " + this.f36362c + UrlTreeKt.componentParamSuffix;
            default:
                return super.toString();
        }
    }

    public final KeyListener u(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return ((mt.p) ((r4.b) this.f36362c).f33058d).x(keyListener);
        }
        return keyListener;
    }

    @Override // r5.b0
    public final void v(int i10, w wVar, n nVar, s sVar) {
        android.util.Pair t10 = t(i10, wVar);
        if (t10 != null) {
            ((t) ((a1) this.f36362c).f19353i).c(new v0(this, t10, nVar, sVar, 2));
        }
    }

    public final boolean w() {
        return ((CardView) this.f36362c).getPreventCornerOverlap();
    }

    public final void x(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f36361b).getContext().obtainStyledAttributes(attributeSet, g.a.f16357i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((mt.p) ((r4.b) this.f36362c).f33058d).D(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final InputConnection z(InputConnection inputConnection, EditorInfo editorInfo) {
        r4.b bVar = (r4.b) this.f36362c;
        if (inputConnection == null) {
            bVar.getClass();
            return null;
        }
        return ((mt.p) bVar.f33058d).B(inputConnection, editorInfo);
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f36360a = i10;
        this.f36361b = obj;
        this.f36362c = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f36360a = i10;
        this.f36362c = obj;
        this.f36361b = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(nn.d dVar) {
        this(29, (Object) null);
        this.f36360a = 29;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e() {
        this((Object) null);
        this.f36360a = 22;
    }

    public e(Object obj) {
        this.f36360a = 22;
        k1 a10 = l1.a(new Pair(Integer.MIN_VALUE, obj));
        this.f36361b = a10;
        this.f36362c = new g7.x(a10, 1);
    }

    public e(int i10) {
        this.f36360a = i10;
        if (i10 != 26) {
            this.f36361b = new ByteArrayOutputStream(512);
            this.f36362c = new DataOutputStream((ByteArrayOutputStream) this.f36361b);
        } else {
            this.f36361b = new LiveData();
            this.f36362c = new Object();
            D(androidx.work.b0.L);
        }
    }

    public e(List list) {
        this.f36360a = 20;
        this.f36361b = list;
        this.f36362c = new z5.b0[list.size()];
    }

    public e(l7.s sVar) {
        this.f36360a = 23;
        this.f36361b = Collections.newSetFromMap(new IdentityHashMap());
        this.f36362c = sVar;
    }

    public e(TextView textView) {
        this.f36360a = 2;
        textView.getClass();
        this.f36361b = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        this(24, str, (Object) null);
        this.f36360a = 24;
    }

    public e(EditText editText) {
        this.f36360a = 1;
        this.f36361b = editText;
        this.f36362c = new r4.b(editText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(u uVar, int i10) {
        this(uVar);
        this.f36360a = 19;
    }

    public e(u uVar) {
        this.f36360a = 19;
        this.f36361b = uVar;
        this.f36362c = new e5.p();
    }

    public e(b5.t tVar, SparseArray sparseArray) {
        this.f36360a = 12;
        this.f36361b = tVar;
        SparseBooleanArray sparseBooleanArray = tVar.f3586a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a10 = tVar.a(i10);
            j5.b bVar = (j5.b) sparseArray.get(a10);
            bVar.getClass();
            sparseArray2.append(a10, bVar);
        }
        this.f36362c = sparseArray2;
    }

    public e(Handler handler, d0 d0Var) {
        this.f36360a = 13;
        this.f36361b = handler;
        this.f36362c = d0Var;
    }

    public e(ArrayList arrayList, ArrayList arrayList2) {
        this.f36360a = 5;
        int size = arrayList.size();
        this.f36361b = new int[size];
        this.f36362c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f36361b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f36362c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public e(int i10, int i11) {
        this.f36360a = 5;
        this.f36361b = new int[]{i10, i11};
        this.f36362c = new float[]{s0.g.f34069a, 1.0f};
    }

    public e(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f36360a = 7;
        lowerBound = bounds.getLowerBound();
        this.f36361b = u3.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f36362c = u3.c.c(upperBound);
    }

    public e(int i10, int i11, int i12) {
        this.f36360a = 5;
        this.f36361b = new int[]{i10, i11, i12};
        this.f36362c = new float[]{s0.g.f34069a, 0.5f, 1.0f};
    }

    public e(CardView cardView) {
        this.f36360a = 3;
        this.f36362c = cardView;
    }

    public e(f0 f0Var) {
        this.f36360a = 21;
        this.f36362c = f0Var;
        this.f36361b = new b5.m(new byte[4], 1, (Object) null);
    }

    public e(Uri uri) {
        this.f36360a = 9;
        this.f36361b = uri;
    }
}
