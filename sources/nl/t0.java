package nl;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookSdk;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final String f28937a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f28938b;

    /* renamed from: c, reason: collision with root package name */
    public Exception[] f28939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f28940d;

    public t0(w0 this$0, String action, Bundle parameters) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f28940d = this$0;
        this.f28937a = action;
        this.f28938b = parameters;
        this.f28939c = new Exception[0];
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [nl.s0] */
    public final String[] a(Void... p02) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(p02, "p0");
            String[] stringArray = this.f28938b.getStringArray("media");
            if (stringArray == null) {
                return null;
            }
            final String[] strArr = new String[stringArray.length];
            this.f28939c = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            Date date = xk.a.f40309l;
            xk.a q10 = ek.h.q();
            try {
                int length = stringArray.length - 1;
                if (length >= 0) {
                    final int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((xk.a0) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri uri = Uri.parse(stringArray[i10]);
                        if (n0.B(uri)) {
                            strArr[i10] = uri.toString();
                            countDownLatch.countDown();
                        } else {
                            ?? r10 = new xk.v() { // from class: nl.s0
                                @Override // xk.v
                                public final void onCompleted(xk.d0 response) {
                                    xk.q qVar;
                                    String str;
                                    int i12 = i10;
                                    String[] results = strArr;
                                    Intrinsics.checkNotNullParameter(results, "$results");
                                    t0 this$0 = this;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    CountDownLatch latch = countDownLatch;
                                    Intrinsics.checkNotNullParameter(latch, "$latch");
                                    Intrinsics.checkNotNullParameter(response, "response");
                                    try {
                                        qVar = response.f40344c;
                                        str = "Error staging photo.";
                                    } catch (Exception e10) {
                                        this$0.f28939c[i12] = e10;
                                    }
                                    if (qVar != null) {
                                        String a10 = qVar.a();
                                        if (a10 != null) {
                                            str = a10;
                                        }
                                        throw new FacebookGraphResponseException(response, str);
                                    }
                                    JSONObject jSONObject = response.f40343b;
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("uri");
                                        if (optString != null) {
                                            results[i12] = optString;
                                            latch.countDown();
                                            return;
                                        }
                                        throw new FacebookException("Error staging photo.");
                                    }
                                    throw new FacebookException("Error staging photo.");
                                }
                            };
                            Intrinsics.checkNotNullExpressionValue(uri, "uri");
                            concurrentLinkedQueue.add(yk.o.U(q10, uri, r10).d());
                        }
                        if (i11 > length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Exception unused) {
                Iterator it2 = concurrentLinkedQueue.iterator();
                while (it2.hasNext()) {
                    ((xk.a0) it2.next()).cancel(true);
                }
                return null;
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.f28938b;
        w0 w0Var = this.f28940d;
        if (sl.a.b(this)) {
            return;
        }
        try {
            ProgressDialog progressDialog = w0Var.f28956e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            Exception[] excArr = this.f28939c;
            int length = excArr.length;
            int i10 = 0;
            while (i10 < length) {
                Exception exc = excArr[i10];
                i10++;
                if (exc != null) {
                    w0Var.e(exc);
                    return;
                }
            }
            if (strArr == null) {
                w0Var.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List b10 = vt.t.b(strArr);
            if (b10.contains(null)) {
                w0Var.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            n0.N(bundle, new JSONArray((Collection) b10));
            w0Var.f28952a = n0.b(l.c(), FacebookSdk.getGraphApiVersion() + "/dialog/" + this.f28937a, bundle).toString();
            ImageView imageView = w0Var.f28957f;
            if (imageView != null) {
                w0Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            b((String[]) obj);
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
