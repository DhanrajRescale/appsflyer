package g4;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f16533a;

    public f(Object obj) {
        this.f16533a = (InputContentInfo) obj;
    }

    @Override // g4.g
    public final Uri a() {
        return this.f16533a.getContentUri();
    }

    @Override // g4.g
    public final void d() {
        this.f16533a.requestPermission();
    }

    @Override // g4.g
    public final Uri e() {
        return this.f16533a.getLinkUri();
    }

    @Override // g4.g
    public final ClipDescription f() {
        return this.f16533a.getDescription();
    }

    @Override // g4.g
    public final Object h() {
        return this.f16533a;
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f16533a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
