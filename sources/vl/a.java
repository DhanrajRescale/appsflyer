package vl;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fu.n;
import in.juspay.hypersdk.safe.Godel;
import iu.z;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f38169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38170f;

    public /* synthetic */ a(Object obj, Object obj2, String str, Serializable serializable, Object obj3, int i10) {
        this.f38165a = i10;
        this.f38167c = obj;
        this.f38168d = obj2;
        this.f38166b = str;
        this.f38169e = serializable;
        this.f38170f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BufferedReader bufferedReader;
        int i10 = this.f38165a;
        String kid = this.f38166b;
        Object obj = this.f38170f;
        Serializable serializable = this.f38169e;
        Object obj2 = this.f38168d;
        Object obj3 = this.f38167c;
        switch (i10) {
            case 0:
                URL openIdKeyUrl = (URL) obj3;
                z result = (z) obj2;
                ReentrantLock lock = (ReentrantLock) serializable;
                Condition condition = (Condition) obj;
                Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
                Intrinsics.checkNotNullParameter(result, "$result");
                Intrinsics.checkNotNullParameter(kid, "$kid");
                Intrinsics.checkNotNullParameter(lock, "$lock");
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(openIdKeyUrl.openConnection());
                if (uRLConnection != null) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    try {
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                            }
                            String b10 = n.b(bufferedReader);
                            httpURLConnection.getInputStream().close();
                            result.f20560a = new JSONObject(b10).optString(kid);
                            httpURLConnection.disconnect();
                            lock.lock();
                            try {
                                condition.signal();
                                Unit unit = Unit.f23355a;
                            } finally {
                            }
                        } catch (Throwable th2) {
                            httpURLConnection.disconnect();
                            lock.lock();
                            try {
                                condition.signal();
                                Unit unit2 = Unit.f23355a;
                                throw th2;
                            } finally {
                            }
                        }
                    } catch (Exception e10) {
                        String name = b.class.getName();
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "Error getting public key";
                        }
                        Log.d(name, message);
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                            Unit unit3 = Unit.f23355a;
                        } finally {
                        }
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            default:
                ((Godel) obj3).lambda$onBrowserReady$0((Activity) obj2, kid, (String) serializable, (String) obj);
                return;
        }
    }
}
