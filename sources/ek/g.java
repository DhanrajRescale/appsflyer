package ek;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g implements yj.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15588a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15589b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f15588a = i10;
        this.f15589b = obj;
    }

    @Override // yj.e
    public final Class a() {
        switch (this.f15588a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f15589b.getClass();
        }
    }

    @Override // yj.e
    public final void c() {
    }

    @Override // yj.e
    public final void cancel() {
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, yj.d dVar) {
        int i10 = this.f15588a;
        Object obj = this.f15589b;
        switch (i10) {
            case 0:
                try {
                    dVar.j(rk.a.a((File) obj));
                    return;
                } catch (IOException e10) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                    }
                    dVar.e(e10);
                    return;
                }
            default:
                dVar.j(obj);
                return;
        }
    }

    @Override // yj.e
    public final xj.a f() {
        return xj.a.f40286a;
    }
}
