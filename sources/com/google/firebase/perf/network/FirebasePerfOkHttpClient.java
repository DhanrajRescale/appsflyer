package com.google.firebase.perf.network;

import android.os.SystemClock;
import androidx.annotation.Keep;
import br.h;
import er.f;
import fr.i;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zq.g;

/* loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    public static void a(Response response, g gVar, long j10, long j11) {
        Request request = response.request();
        if (request == null) {
            return;
        }
        gVar.l(request.url().url().toString());
        gVar.d(request.method());
        if (request.body() != null) {
            long contentLength = request.body().contentLength();
            if (contentLength != -1) {
                gVar.f(contentLength);
            }
        }
        ResponseBody body = response.body();
        if (body != null) {
            long contentLength2 = body.getContentLength();
            if (contentLength2 != -1) {
                gVar.j(contentLength2);
            }
            MediaType mediaType = body.get$contentType();
            if (mediaType != null) {
                gVar.i(mediaType.getMediaType());
            }
        }
        gVar.e(response.code());
        gVar.h(j10);
        gVar.k(j11);
        gVar.b();
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        i iVar = new i();
        call.enqueue(new br.g(callback, f.f15842s, iVar, iVar.f16224a));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        g gVar = new g(f.f15842s);
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        long micros2 = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
        try {
            Response execute = call.execute();
            TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            a(execute, gVar, micros, TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - micros2);
            return execute;
        } catch (IOException e10) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    gVar.l(url.url().toString());
                }
                if (request.method() != null) {
                    gVar.d(request.method());
                }
            }
            gVar.h(micros);
            TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            gVar.k(TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - micros2);
            h.c(gVar);
            throw e10;
        }
    }
}
