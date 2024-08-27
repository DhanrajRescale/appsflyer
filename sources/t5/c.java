package t5;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import mt.p;
import yk.j;

/* loaded from: classes.dex */
public final class c implements s6.c {

    /* renamed from: a, reason: collision with root package name */
    public final p f35344a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final s6.d f35345b = new h5.f(1);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f35346c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f35347d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35348e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mt.p] */
    /* JADX WARN: Type inference failed for: r0v1, types: [h5.f, s6.d] */
    public c() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f35346c.addFirst(new a(this, 0));
        }
        this.f35347d = 0;
    }

    @Override // s6.c
    public final void a(long j10) {
    }

    @Override // h5.e
    public final void b(s6.d dVar) {
        boolean z10;
        boolean z11 = true;
        j.H0(!this.f35348e);
        if (this.f35347d == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.H0(z10);
        if (this.f35345b != dVar) {
            z11 = false;
        }
        j.E0(z11);
        this.f35347d = 2;
    }

    @Override // h5.e
    public final Object c() {
        j.H0(!this.f35348e);
        if (this.f35347d == 2) {
            ArrayDeque arrayDeque = this.f35346c;
            if (!arrayDeque.isEmpty()) {
                s6.e eVar = (s6.e) arrayDeque.removeFirst();
                s6.d dVar = this.f35345b;
                if (dVar.g(4)) {
                    eVar.e(4);
                } else {
                    long j10 = dVar.f18004f;
                    p pVar = this.f35344a;
                    ByteBuffer byteBuffer = dVar.f18002d;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    pVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    eVar.j(dVar.f18004f, new b(j10, e5.a.j(d5.b.J, parcelableArrayList)), 0L);
                }
                dVar.i();
                this.f35347d = 0;
                return eVar;
            }
        }
        return null;
    }

    @Override // h5.e
    public final Object d() {
        j.H0(!this.f35348e);
        if (this.f35347d != 0) {
            return null;
        }
        this.f35347d = 1;
        return this.f35345b;
    }

    @Override // h5.e
    public final void flush() {
        j.H0(!this.f35348e);
        this.f35345b.i();
        this.f35347d = 0;
    }

    @Override // h5.e
    public final void release() {
        this.f35348e = true;
    }
}
