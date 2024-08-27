package aq;

import android.app.Application;
import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final f f2756a;

    public s(pp.g gVar) {
        gVar.a();
        this.f2756a = new f(gVar);
        BackgroundDetector.initialize((Application) gVar.f31271a.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new r(this));
    }
}
