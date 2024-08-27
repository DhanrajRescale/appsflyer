package q7;

import android.content.Context;
import java.io.File;
import m.c0;

/* loaded from: classes.dex */
public final class e implements p7.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31814a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31815b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f31816c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31817d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f31818e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public d f31819f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31820g;

    public e(Context context, String str, c0 c0Var, boolean z10) {
        this.f31814a = context;
        this.f31815b = str;
        this.f31816c = c0Var;
        this.f31817d = z10;
    }

    @Override // p7.d
    public final p7.a A() {
        return a().b();
    }

    public final d a() {
        d dVar;
        synchronized (this.f31818e) {
            try {
                if (this.f31819f == null) {
                    b[] bVarArr = new b[1];
                    if (this.f31815b != null && this.f31817d) {
                        this.f31819f = new d(this.f31814a, new File(this.f31814a.getNoBackupFilesDir(), this.f31815b).getAbsolutePath(), bVarArr, this.f31816c);
                    } else {
                        this.f31819f = new d(this.f31814a, this.f31815b, bVarArr, this.f31816c);
                    }
                    this.f31819f.setWriteAheadLoggingEnabled(this.f31820g);
                }
                dVar = this.f31819f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // p7.d
    public final String getDatabaseName() {
        return this.f31815b;
    }

    @Override // p7.d
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f31818e) {
            try {
                d dVar = this.f31819f;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z10);
                }
                this.f31820g = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
