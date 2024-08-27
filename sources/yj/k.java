package yj;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AssetManager assetManager, String str, int i10) {
        super(assetManager, str, 0);
        this.f41665e = i10;
    }

    @Override // yj.e
    public final Class a() {
        switch (this.f41665e) {
            case 0:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // yj.b
    public final void b(Object obj) {
        switch (this.f41665e) {
            case 0:
                ((ParcelFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // yj.b
    public final Closeable e(AssetManager assetManager, String str) {
        switch (this.f41665e) {
            case 0:
                return assetManager.openFd(str).getParcelFileDescriptor();
            default:
                return assetManager.open(str);
        }
    }
}
