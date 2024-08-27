package ek;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.navigation.NavigationView;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.perf.metrics.Trace;
import com.google.protobuf.z0;
import d4.n1;
import d4.w0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class h0 implements x, i0, lk.i, e4.y, mo.f, l.m, Continuation, cs.b, et.a, nv.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15592a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15593b;

    public /* synthetic */ h0(int i10, int i11) {
        this.f15592a = i10;
        this.f15593b = null;
    }

    public static boolean q(CharSequence charSequence, int i10, int i11) {
        if (i11 < 0 || i11 > charSequence.length()) {
            return false;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i11 + i12;
            if (i13 >= charSequence.length() || !Character.isLetterOrDigit(charSequence.charAt(i13))) {
                return false;
            }
        }
        return true;
    }

    public final void A(int i10, int i11) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.G(i10, 0);
        jVar.E(i11);
    }

    public final void B(int i10, long j10) {
        ((com.google.protobuf.j) this.f15593b).I(i10, j10);
    }

    public final void C(int i10, z0 z0Var, Object obj) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        com.google.protobuf.b bVar = (com.google.protobuf.b) obj;
        jVar.G(i10, 2);
        jVar.H(bVar.h(z0Var));
        z0Var.d(bVar, jVar.f11931c);
    }

    public final void D(int i10, int i11) {
        ((com.google.protobuf.j) this.f15593b).A(i10, i11);
    }

    public final void E(int i10, long j10) {
        ((com.google.protobuf.j) this.f15593b).C(i10, j10);
    }

    public final void F(int i10, int i11) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.G(i10, 0);
        jVar.H((i11 >> 31) ^ (i11 << 1));
    }

    public final void G(int i10, long j10) {
        ((com.google.protobuf.j) this.f15593b).I(i10, (j10 >> 63) ^ (j10 << 1));
    }

    public final void H(int i10, int i11) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.G(i10, 0);
        jVar.H(i11);
    }

    public final void I(int i10, long j10) {
        ((com.google.protobuf.j) this.f15593b).I(i10, j10);
    }

    public final void a(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (((StringBuilder) this.f15593b).charAt(r0.length() - 1) == '?') {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str3 = "&";
        }
        ((StringBuilder) this.f15593b).append(String.format("%s%s=%s", str3, str, str2));
    }

    public final gr.a0 b() {
        List unmodifiableList;
        gr.x O = gr.a0.O();
        O.o(((Trace) this.f15593b).f11840d);
        O.m(((Trace) this.f15593b).f11847k.f16224a);
        Trace trace = (Trace) this.f15593b;
        O.n(trace.f11847k.b(trace.f11848l));
        for (zq.d dVar : ((Trace) this.f15593b).f11841e.values()) {
            O.l(dVar.f42799b.get(), dVar.f42798a);
        }
        ArrayList arrayList = ((Trace) this.f15593b).f11844h;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                O.k(new h0((Trace) it.next(), 21).b());
            }
        }
        Map<String, String> attributes = ((Trace) this.f15593b).getAttributes();
        O.i();
        gr.a0.z((gr.a0) O.f11975b).putAll(attributes);
        Trace trace2 = (Trace) this.f15593b;
        synchronized (trace2.f11843g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (cr.a aVar : trace2.f11843g) {
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gr.w[] b10 = cr.a.b(unmodifiableList);
        if (b10 != null) {
            List asList = Arrays.asList(b10);
            O.i();
            gr.a0.B((gr.a0) O.f11975b, asList);
        }
        return (gr.a0) O.g();
    }

    public final int c(Editable editable, int i10) {
        int i11;
        if (i10 >= 0 && i10 <= editable.length()) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        xr.a[] aVarArr = (xr.a[]) editable.getSpans(0, editable.length(), xr.a.class);
        int length = editable.length();
        for (xr.a aVar : aVarArr) {
            int spanStart = editable.getSpanStart(aVar);
            if (spanStart < length && spanStart >= i11) {
                length = spanStart;
            }
        }
        String substring = editable.toString().substring(i11, editable.length());
        int length2 = editable.length();
        if (substring.contains(((bs.a) this.f15593b).f7304a)) {
            length2 = substring.indexOf(((bs.a) this.f15593b).f7304a) + i11;
        }
        int min = Math.min(length, length2);
        while (i10 >= 0 && i10 < min) {
            if (o(editable.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    @Override // e4.y
    public final boolean d(View view) {
        int width;
        boolean z10 = false;
        if (!((SwipeDismissBehavior) this.f15593b).s(view)) {
            return false;
        }
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(view) == 1) {
            z10 = true;
        }
        int i10 = ((SwipeDismissBehavior) this.f15593b).f11163e;
        if ((i10 == 0 && z10) || (i10 == 1 && !z10)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(s0.g.f34069a);
        h0 h0Var = ((SwipeDismissBehavior) this.f15593b).f11160b;
        if (h0Var != null) {
            h0Var.p(view);
        }
        return true;
    }

    @Override // nv.o
    public final Object e(Object obj) {
        return Optional.ofNullable(((nv.o) this.f15593b).e((ResponseBody) obj));
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        return new j0(this);
    }

    public final int g(Editable editable, int i10) {
        int k10 = k(editable, i10);
        if (i10 >= 0 && i10 <= editable.length()) {
            int k11 = k(new SpannableStringBuilder(editable), i10);
            int i11 = i10 - 1;
            int i12 = 0;
            while (true) {
                if (i11 < k11) {
                    break;
                }
                char charAt = editable.charAt(i11);
                if (m(charAt)) {
                    if ((i11 == 0 || o(editable.charAt(i11 - 1))) && charAt != 0) {
                        for (int i13 = i10 - 1; i13 >= k10; i13--) {
                            if (m(editable.charAt(i13)) && (i13 == 0 || o(editable.charAt(i13 - 1)))) {
                                return i13;
                            }
                        }
                        return -1;
                    }
                } else {
                    if (o(charAt) && (i12 = i12 + 1) == ((bs.a) this.f15593b).f7306c) {
                        break;
                    }
                    i11--;
                }
            }
        }
        int i14 = ((bs.a) this.f15593b).f7306c;
        int i15 = i10;
        while (i15 > k10 && !o(editable.charAt(i15 - 1))) {
            i15--;
        }
        for (int i16 = 0; i16 < i14 - 1; i16++) {
            if (i15 > k10 && o(editable.charAt(i15 - 1))) {
                i15--;
            }
            if (i15 > k10 && o(editable.charAt(i15 - 1))) {
                break;
            }
            while (i15 > k10 && !o(editable.charAt(i15 - 1))) {
                i15--;
            }
        }
        while (i15 < i10 && (o(editable.charAt(i15)) || m(editable.charAt(i15)))) {
            i15++;
        }
        return i15;
    }

    public final short h(int i10) {
        if (((ByteBuffer) this.f15593b).remaining() - i10 >= 2) {
            return ((ByteBuffer) this.f15593b).getShort(i10);
        }
        return (short) -1;
    }

    @Override // ek.i0
    public final yj.e i(Uri uri) {
        return new yj.a((ContentResolver) this.f15593b, uri, 1);
    }

    public final String j() {
        return ((Bundle) this.f15593b).getString("com.google.firebase.auth.KEY_PROVIDER_ID");
    }

    public final int k(Editable editable, int i10) {
        int i11 = 0;
        if (i10 < 0 || i10 > editable.length()) {
            i10 = 0;
        }
        int i12 = 0;
        for (xr.a aVar : (xr.a[]) editable.getSpans(0, editable.length(), xr.a.class)) {
            int spanEnd = editable.getSpanEnd(aVar);
            if (spanEnd > i12 && spanEnd <= i10) {
                i12 = spanEnd;
            }
        }
        String substring = editable.toString().substring(0, i10);
        if (substring.contains(((bs.a) this.f15593b).f7304a)) {
            i11 = substring.lastIndexOf(((bs.a) this.f15593b).f7304a) + 1;
        }
        return Math.max(i12, i11);
    }

    public final boolean l(xr.d dVar, int i10) {
        CharSequence subSequence = dVar.subSequence(0, i10);
        for (int i11 = i10 - 1; i11 >= 0 && i11 < subSequence.length(); i11--) {
            if (m(subSequence.charAt(i11))) {
                if (i11 != 0 && !o(subSequence.charAt(i11 - 1))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean m(char c10) {
        String str = ((bs.a) this.f15593b).f7307d;
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (c10 == str.charAt(i10)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.m
    public final void n(l.o oVar) {
    }

    public final boolean o(char c10) {
        String str = ((bs.a) this.f15593b).f7308e;
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (c10 == str.charAt(i10)) {
                return true;
            }
        }
        return false;
    }

    public final void p(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((wo.k) this.f15593b).a(0);
    }

    public final void r(int i10, boolean z10) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.G(i10, 0);
        jVar.x(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // et.a
    public final void run() {
        ((Future) this.f15593b).get();
    }

    public final void s(int i10, com.google.protobuf.h hVar) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.G(i10, 2);
        jVar.z(hVar);
    }

    public final void t(int i10, double d10) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.getClass();
        jVar.C(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f15592a) {
            case 16:
                Uri uri = (Uri) this.f15593b;
                aq.v vVar = GenericIdpActivity.f11655c;
                Uri.Builder buildUpon = uri.buildUpon();
                if (!task.isSuccessful()) {
                    Log.e("GenericIdpActivity", "Unexpected error getting App Check token: ".concat(String.valueOf(task.getException().getMessage())));
                    return buildUpon.build();
                }
                a3.a.u(task.getResult());
                throw null;
            default:
                if (task.isSuccessful()) {
                    return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f15593b);
                }
                Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
                if (exc instanceof zzbo) {
                    if (Log.isLoggable("RecaptchaHandler", 4)) {
                        Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - ".concat(String.valueOf(exc.getMessage())));
                    }
                    return Tasks.forResult(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return Tasks.forException(exc);
        }
    }

    public final String toString() {
        switch (this.f15592a) {
            case 2:
                return super.toString() + "{fragment=" + ((lk.g) this.f15593b) + UrlTreeKt.componentParamSuffix;
            default:
                return super.toString();
        }
    }

    public final void u(int i10, int i11) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.G(i10, 0);
        jVar.E(i11);
    }

    @Override // l.m
    public final boolean v(l.o oVar, MenuItem menuItem) {
        ((NavigationView) this.f15593b).getClass();
        return false;
    }

    public final void w(int i10, int i11) {
        ((com.google.protobuf.j) this.f15593b).A(i10, i11);
    }

    public final void x(int i10, long j10) {
        ((com.google.protobuf.j) this.f15593b).C(i10, j10);
    }

    public final void y(int i10, float f10) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.getClass();
        jVar.A(i10, Float.floatToRawIntBits(f10));
    }

    public final void z(int i10, z0 z0Var, Object obj) {
        com.google.protobuf.j jVar = (com.google.protobuf.j) this.f15593b;
        jVar.G(i10, 3);
        z0Var.d((com.google.protobuf.b) obj, jVar.f11931c);
        jVar.G(i10, 4);
    }

    public h0(Bundle bundle) {
        this.f15592a = 15;
        this.f15593b = bundle;
    }

    public h0(RecaptchaAction recaptchaAction) {
        this.f15592a = 17;
        this.f15593b = recaptchaAction;
    }

    public /* synthetic */ h0(Object obj) {
        this.f15592a = 14;
    }

    public /* synthetic */ h0(Object obj, int i10) {
        this.f15592a = i10;
        this.f15593b = obj;
    }

    public h0(int i10) {
        this.f15592a = i10;
        if (i10 != 4) {
            this.f15593b = new byte[4];
        } else {
            this.f15593b = new ConcurrentHashMap();
        }
    }

    public h0(String str) {
        this.f15592a = 5;
        Preconditions.checkNotEmpty(str);
        this.f15593b = new StringBuilder(jr.h.r(str, "?"));
    }

    public h0(com.google.protobuf.j jVar) {
        this.f15592a = 22;
        Charset charset = com.google.protobuf.z.f12003a;
        if (jVar != null) {
            this.f15593b = jVar;
            jVar.f11931c = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0() {
        this(ComponentDiscoveryService.class, 18);
        this.f15592a = 18;
    }

    public h0(byte[] bArr, int i10) {
        this.f15592a = 1;
        this.f15593b = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
    }
}
