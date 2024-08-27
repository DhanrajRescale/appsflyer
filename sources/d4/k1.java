package d4;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k1 implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f13773a;

    public k1(e0 e0Var) {
        this.f13773a = e0Var;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        h hVar = new h(new t9.c(contentInfo));
        h a10 = ((h4.v) this.f13773a).a(view, hVar);
        if (a10 == null) {
            return null;
        }
        if (a10 == hVar) {
            return contentInfo;
        }
        ContentInfo m10 = a10.f13744a.m();
        Objects.requireNonNull(m10);
        return a4.c.g(m10);
    }
}
