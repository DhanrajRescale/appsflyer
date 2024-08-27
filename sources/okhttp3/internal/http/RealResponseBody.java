package okhttp3.internal.http;

import bv.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", "Lokhttp3/MediaType;", "contentType", "Lbv/l;", "source", HttpUrl.FRAGMENT_ENCODE_SET, "contentTypeString", "Ljava/lang/String;", "J", "Lbv/l;", "<init>", "(Ljava/lang/String;JLbv/l;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;

    @NotNull
    private final l source;

    public RealResponseBody(String str, long j10, @NotNull l source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = source;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    @NotNull
    /* renamed from: source, reason: from getter */
    public l getSource() {
        return this.source;
    }
}
