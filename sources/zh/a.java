package zh;

import android.content.ComponentName;
import android.net.Uri;
import com.assetgro.stockgro.ui.social.auth.util.linkedin.helpers.LinkedInAuthenticationActivity;
import com.google.firebase.messaging.t;
import kotlin.jvm.internal.Intrinsics;
import q.e;
import q.f;
import q.g;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedInAuthenticationActivity f42458c;

    public a(String str, LinkedInAuthenticationActivity linkedInAuthenticationActivity) {
        this.f42457b = str;
        this.f42458c = linkedInAuthenticationActivity;
    }

    @Override // q.g
    public final void a(ComponentName componentName, t client) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(client, "client");
        String str = this.f42457b;
        if (str != null) {
            f a10 = new e().a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            client.y();
            a10.a(this.f42458c, Uri.parse(str));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
