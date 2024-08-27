package in;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f20442a;

    public o(long j10) {
        this.f20442a = j10;
    }

    public static o a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new o(Long.parseLong(jsonReader.nextString()));
                    }
                    return new o(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        if (this.f20442a == ((o) obj).f20442a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f20442a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return a3.a.j(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f20442a, UrlTreeKt.componentParamSuffix);
    }
}
