package yj;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41650a;

    /* renamed from: b, reason: collision with root package name */
    public Object f41651b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f41652c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f41653d;

    public /* synthetic */ b(Object obj, Comparable comparable, int i10) {
        this.f41650a = i10;
        this.f41653d = obj;
        this.f41652c = comparable;
    }

    public abstract void b(Object obj);

    @Override // yj.e
    public final void c() {
        switch (this.f41650a) {
            case 0:
                Object obj = this.f41651b;
                if (obj != null) {
                    try {
                        b(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.f41651b;
                if (obj2 != null) {
                    try {
                        b(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // yj.e
    public final void cancel() {
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, d dVar) {
        int i10 = this.f41650a;
        Object obj = this.f41653d;
        Comparable comparable = this.f41652c;
        switch (i10) {
            case 0:
                try {
                    Closeable e10 = e((AssetManager) obj, (String) comparable);
                    this.f41651b = e10;
                    dVar.j(e10);
                    return;
                } catch (IOException e11) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e11);
                    }
                    dVar.e(e11);
                    return;
                }
            default:
                try {
                    Object g10 = g((ContentResolver) obj, (Uri) comparable);
                    this.f41651b = g10;
                    dVar.j(g10);
                    return;
                } catch (FileNotFoundException e12) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e12);
                    }
                    dVar.e(e12);
                    return;
                }
        }
    }

    public abstract Closeable e(AssetManager assetManager, String str);

    @Override // yj.e
    public final xj.a f() {
        return xj.a.f40286a;
    }

    public abstract Object g(ContentResolver contentResolver, Uri uri);
}
