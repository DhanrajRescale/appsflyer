package wl;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.Scopes;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import vt.k0;

/* loaded from: classes.dex */
public final class k implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39219a;

    /* renamed from: b, reason: collision with root package name */
    public final h.f f39220b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.g f39221c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39222d;

    /* renamed from: e, reason: collision with root package name */
    public Messenger f39223e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39224f;

    /* renamed from: g, reason: collision with root package name */
    public final int f39225g;

    /* renamed from: h, reason: collision with root package name */
    public final String f39226h;

    /* renamed from: i, reason: collision with root package name */
    public final int f39227i;

    /* renamed from: j, reason: collision with root package name */
    public final String f39228j;

    public k(Context context, q request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        String applicationId = request.f39248d;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f39219a = applicationContext != null ? applicationContext : context;
        this.f39224f = 65536;
        this.f39225g = 65537;
        this.f39226h = applicationId;
        this.f39227i = 20121101;
        this.f39228j = request.f39259o;
        this.f39220b = new h.f(this, 4);
    }

    public final void a(Bundle result) {
        if (this.f39222d) {
            this.f39222d = false;
            androidx.fragment.app.g gVar = this.f39221c;
            if (gVar != null) {
                m this$0 = (m) gVar.f1704b;
                q request = (q) gVar.f1705c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                this$0.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                k kVar = this$0.f39232c;
                if (kVar != null) {
                    kVar.f39221c = null;
                }
                this$0.f39232c = null;
                v vVar = this$0.d().f39280e;
                if (vVar != null) {
                    View view = vVar.f39291a.f39297e;
                    if (view != null) {
                        view.setVisibility(8);
                    } else {
                        Intrinsics.k("progressBar");
                        throw null;
                    }
                }
                if (result != null) {
                    List stringArrayList = result.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = vt.i0.f38321a;
                    }
                    Set<String> set = request.f39246b;
                    if (set == null) {
                        set = k0.f38324a;
                    }
                    String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains(Scopes.OPEN_ID) && (string == null || string.length() == 0)) {
                        this$0.d().k();
                        return;
                    }
                    if (stringArrayList.containsAll(set)) {
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(result, "result");
                        String string2 = result.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            this$0.m(result, request);
                            return;
                        }
                        v vVar2 = this$0.d().f39280e;
                        if (vVar2 != null) {
                            View view2 = vVar2.f39291a.f39297e;
                            if (view2 != null) {
                                view2.setVisibility(0);
                            } else {
                                Intrinsics.k("progressBar");
                                throw null;
                            }
                        }
                        String string3 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 != null) {
                            n0.p(new l(result, this$0, request), string3);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        this$0.a(TextUtils.join(",", hashSet), "new_permissions");
                    }
                    Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
                    request.f39246b = hashSet;
                }
                this$0.d().k();
            }
        }
    }

    @Override // android.content.ServiceConnection
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f39223e = new Messenger(service);
        Bundle data = new Bundle();
        data.putString("com.facebook.platform.extra.APPLICATION_ID", this.f39226h);
        String str = this.f39228j;
        if (str != null) {
            data.putString("com.facebook.platform.extra.NONCE", str);
        }
        Intrinsics.checkNotNullParameter(data, "data");
        Message obtain = Message.obtain((Handler) null, this.f39224f);
        obtain.arg1 = this.f39227i;
        obtain.setData(data);
        obtain.replyTo = new Messenger(this.f39220b);
        try {
            Messenger messenger = this.f39223e;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f39223e = null;
        try {
            this.f39219a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
