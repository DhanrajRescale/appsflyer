package d4;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ContentInfo.Builder f13729a;

    public d(ClipData clipData, int i10) {
        this.f13729a = a4.c.e(clipData, i10);
    }

    @Override // d4.e
    public final h b() {
        ContentInfo build;
        build = this.f13729a.build();
        return new h(new t9.c(build));
    }

    @Override // d4.e
    public final void c(Uri uri) {
        this.f13729a.setLinkUri(uri);
    }

    @Override // d4.e
    public final void d(int i10) {
        this.f13729a.setFlags(i10);
    }

    @Override // d4.e
    public final void setExtras(Bundle bundle) {
        this.f13729a.setExtras(bundle);
    }
}
