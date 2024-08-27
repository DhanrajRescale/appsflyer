package ue;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class b0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f37074a = context;
        this.f37075b = str;
        this.f37076c = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b0(this.f37074a, this.f37075b, this.f37076c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        InputStream inputStream;
        String str = this.f37075b;
        Context context = this.f37074a;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        try {
            File fileStreamPath = context.getFileStreamPath(str);
            if (fileStreamPath != null) {
                fileStreamPath.delete();
            }
            File file = new File(context.getFilesDir(), str);
            Response execute = FirebasePerfOkHttpClient.execute(new OkHttpClient().newCall(new Request.Builder().url(this.f37076c).build()));
            if (execute.isSuccessful()) {
                ResponseBody body = execute.body();
                if (body != null) {
                    inputStream = body.byteStream();
                } else {
                    inputStream = null;
                }
                if (inputStream != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        zq.f.C(inputStream, fileOutputStream);
                        yk.g.k(fileOutputStream, null);
                    } finally {
                    }
                }
            }
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
