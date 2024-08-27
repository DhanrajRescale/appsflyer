package q3;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31582e;

    /* renamed from: f, reason: collision with root package name */
    public Object f31583f;

    public b0(int i10) {
        this.f31582e = i10;
        if (i10 != 1) {
            return;
        }
        this.f31583f = new ArrayList();
    }

    @Override // q3.f0
    public final void a(Bundle bundle) {
        switch (this.f31582e) {
            case 0:
                super.a(bundle);
                return;
            default:
                super.a(bundle);
                return;
        }
    }

    @Override // q3.f0
    public final void b(r0 r0Var) {
        int i10 = this.f31582e;
        Notification.Builder builder = r0Var.f31639b;
        switch (i10) {
            case 0:
                Notification.BigTextStyle a10 = a0.a(a0.c(a0.b(builder), this.f31612b), (CharSequence) this.f31583f);
                if (this.f31614d) {
                    a0.d(a10, this.f31613c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle c10 = e0.c(e0.b(builder), this.f31612b);
                if (this.f31614d) {
                    e0.d(c10, this.f31613c);
                }
                Iterator it = ((ArrayList) this.f31583f).iterator();
                while (it.hasNext()) {
                    e0.a(c10, (CharSequence) it.next());
                }
                return;
        }
    }

    @Override // q3.f0
    public final String c() {
        switch (this.f31582e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
