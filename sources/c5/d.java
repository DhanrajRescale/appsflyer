package c5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public b f7957b;

    /* renamed from: c, reason: collision with root package name */
    public b f7958c;

    /* renamed from: d, reason: collision with root package name */
    public b f7959d;

    /* renamed from: e, reason: collision with root package name */
    public b f7960e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f7961f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f7962g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7963h;

    public d() {
        ByteBuffer byteBuffer = c.f7956a;
        this.f7961f = byteBuffer;
        this.f7962g = byteBuffer;
        b bVar = b.f7951e;
        this.f7959d = bVar;
        this.f7960e = bVar;
        this.f7957b = bVar;
        this.f7958c = bVar;
    }

    public abstract b a(b bVar);

    @Override // c5.c
    public boolean b() {
        if (this.f7960e != b.f7951e) {
            return true;
        }
        return false;
    }

    @Override // c5.c
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f7962g;
        this.f7962g = c.f7956a;
        return byteBuffer;
    }

    @Override // c5.c
    public final b e(b bVar) {
        this.f7959d = bVar;
        this.f7960e = a(bVar);
        if (b()) {
            return this.f7960e;
        }
        return b.f7951e;
    }

    @Override // c5.c
    public final void f() {
        this.f7963h = true;
        j();
    }

    @Override // c5.c
    public final void flush() {
        this.f7962g = c.f7956a;
        this.f7963h = false;
        this.f7957b = this.f7959d;
        this.f7958c = this.f7960e;
        i();
    }

    @Override // c5.c
    public boolean g() {
        return this.f7963h && this.f7962g == c.f7956a;
    }

    @Override // c5.c
    public final void h() {
        flush();
        this.f7961f = c.f7956a;
        b bVar = b.f7951e;
        this.f7959d = bVar;
        this.f7960e = bVar;
        this.f7957b = bVar;
        this.f7958c = bVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int i10) {
        if (this.f7961f.capacity() < i10) {
            this.f7961f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f7961f.clear();
        }
        ByteBuffer byteBuffer = this.f7961f;
        this.f7962g = byteBuffer;
        return byteBuffer;
    }
}
