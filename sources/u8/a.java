package u8;

import java.io.File;
import y8.m;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36980a;

    public a(boolean z10) {
        this.f36980a = z10;
    }

    @Override // u8.b
    public final String a(Object obj, m mVar) {
        File file = (File) obj;
        if (this.f36980a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
