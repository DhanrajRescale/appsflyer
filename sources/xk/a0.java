package xk;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 extends AsyncTask {

    /* renamed from: c, reason: collision with root package name */
    public static final String f40323c = a0.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final c0 f40324a;

    /* renamed from: b, reason: collision with root package name */
    public Exception f40325b;

    public a0(c0 requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f40324a = requests;
    }

    public final void a(List result) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(result, "result");
            super.onPostExecute(result);
            Exception exc = this.f40325b;
            if (exc != null) {
                String str = f40323c;
                String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                nl.n0.F(str, format);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        ArrayList arrayList = null;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Void[] params = (Void[]) objArr;
            if (!sl.a.b(this)) {
                try {
                    Intrinsics.checkNotNullParameter(params, "params");
                    try {
                        c0 c0Var = this.f40324a;
                        c0Var.getClass();
                        String str = z.f40475j;
                        arrayList = ek.e.p(c0Var);
                    } catch (Exception e10) {
                        this.f40325b = e10;
                    }
                } catch (Throwable th2) {
                    sl.a.a(this, th2);
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            sl.a.a(this, th3);
            return arrayList;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            a((List) obj);
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Handler handler;
        c0 c0Var = this.f40324a;
        if (sl.a.b(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (FacebookSdk.isDebugEnabled()) {
                String str = f40323c;
                String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                nl.n0.F(str, format);
            }
            if (c0Var.f40335a == null) {
                if (Thread.currentThread() instanceof HandlerThread) {
                    handler = new Handler();
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                c0Var.f40335a = handler;
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.f40324a + UrlTreeKt.componentParamSuffix;
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
