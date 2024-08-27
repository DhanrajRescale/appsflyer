package okhttp3;

import bv.l;
import bv.m;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import nn.d;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import ut.a;
import yk.g;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlin/Function1;", "Lbv/l;", "consumer", HttpUrl.FRAGMENT_ENCODE_SET, "sizeMapper", "consumeSource", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/MediaType;", "contentType", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", "Ljava/io/InputStream;", "byteStream", "source", HttpUrl.FRAGMENT_ENCODE_SET, "bytes", "Lbv/m;", "byteString", "Ljava/io/Reader;", "charStream", HttpUrl.FRAGMENT_ENCODE_SET, "string", HttpUrl.FRAGMENT_ENCODE_SET, "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", HttpUrl.FRAGMENT_ENCODE_SET, "cbuf", HttpUrl.FRAGMENT_ENCODE_SET, "off", "len", "read", HttpUrl.FRAGMENT_ENCODE_SET, "close", "Lbv/l;", "source", "Lbv/l;", "Ljava/nio/charset/Charset;", "charset", "Ljava/nio/charset/Charset;", HttpUrl.FRAGMENT_ENCODE_SET, "closed", "Z", "delegate", "Ljava/io/Reader;", "<init>", "(Lbv/l;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class BomAwareReader extends Reader {

        @NotNull
        private final Charset charset;
        private boolean closed;
        private Reader delegate;

        @NotNull
        private final l source;

        public BomAwareReader(@NotNull l source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                unit = Unit.f23355a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.a0(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cbuf, off, len);
            }
            throw new IOException("Stream closed");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\b\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\fJ)\u0010\u0011\u001a\u00020\u0005*\u00020\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\"\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\rH\u0007¨\u0006\u0015"}, d2 = {"Lokhttp3/ResponseBody$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", HttpUrl.FRAGMENT_ENCODE_SET, "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lbv/m;", "(Lbv/m;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lbv/l;", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", "(Lbv/l;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bv.l, bv.j] */
        @NotNull
        public final ResponseBody create(@NotNull String string, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(string, "<this>");
            Charset charset = Charsets.UTF_8;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            ?? obj = new Object();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            obj.h0(string, 0, string.length(), charset);
            return create((l) obj, mediaType, obj.f7365b);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, m mVar, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(mVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, l lVar, MediaType mediaType, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return companion.create(lVar, mediaType, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bv.l, bv.j] */
        @NotNull
        public final ResponseBody create(@NotNull byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            ?? obj = new Object();
            obj.U(bArr);
            return create((l) obj, mediaType, bArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bv.l, bv.j] */
        @NotNull
        public final ResponseBody create(@NotNull m mVar, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            ?? obj = new Object();
            obj.S(mVar);
            return create((l) obj, mediaType, mVar.d());
        }

        @NotNull
        public final ResponseBody create(@NotNull final l lVar, final MediaType mediaType, final long j10) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j10;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                @NotNull
                /* renamed from: source, reason: from getter */
                public l get$this_asResponseBody() {
                    return lVar;
                }
            };
        }

        @a
        @NotNull
        public final ResponseBody create(MediaType contentType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @a
        @NotNull
        public final ResponseBody create(MediaType contentType, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @a
        @NotNull
        public final ResponseBody create(MediaType contentType, @NotNull m content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @a
        @NotNull
        public final ResponseBody create(MediaType contentType, long contentLength, @NotNull l content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType, contentLength);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaType = get$contentType();
        if (mediaType == null || (charset = mediaType.charset(Charsets.UTF_8)) == null) {
            return Charsets.UTF_8;
        }
        return charset;
    }

    private final <T> T consumeSource(Function1<? super l, ? extends T> consumer, Function1<? super T, Integer> sizeMapper) {
        long j10 = get$contentLength();
        if (j10 <= 2147483647L) {
            l lVar = get$this_asResponseBody();
            try {
                T t10 = (T) consumer.invoke(lVar);
                g.k(lVar, null);
                int intValue = ((Number) sizeMapper.invoke(t10)).intValue();
                if (j10 != -1 && j10 != intValue) {
                    throw new IOException("Content-Length (" + j10 + ") and stream length (" + intValue + ") disagree");
                }
                return t10;
            } finally {
            }
        } else {
            throw new IOException(d.j("Cannot buffer entire body for content length: ", j10));
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull l lVar, MediaType mediaType, long j10) {
        return INSTANCE.create(lVar, mediaType, j10);
    }

    @NotNull
    public final InputStream byteStream() {
        return get$this_asResponseBody().a0();
    }

    @NotNull
    public final m byteString() throws IOException {
        long j10 = get$contentLength();
        if (j10 <= 2147483647L) {
            l lVar = get$this_asResponseBody();
            try {
                m E = lVar.E();
                g.k(lVar, null);
                int d10 = E.d();
                if (j10 != -1 && j10 != d10) {
                    throw new IOException("Content-Length (" + j10 + ") and stream length (" + d10 + ") disagree");
                }
                return E;
            } finally {
            }
        } else {
            throw new IOException(d.j("Cannot buffer entire body for content length: ", j10));
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long j10 = get$contentLength();
        if (j10 <= 2147483647L) {
            l lVar = get$this_asResponseBody();
            try {
                byte[] o10 = lVar.o();
                g.k(lVar, null);
                int length = o10.length;
                if (j10 != -1 && j10 != length) {
                    throw new IOException("Content-Length (" + j10 + ") and stream length (" + length + ") disagree");
                }
                return o10;
            } finally {
            }
        } else {
            throw new IOException(d.j("Cannot buffer entire body for content length: ", j10));
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(get$this_asResponseBody());
    }

    /* renamed from: contentLength */
    public abstract long get$contentLength();

    /* renamed from: contentType */
    public abstract MediaType get$contentType();

    @NotNull
    /* renamed from: source */
    public abstract l get$this_asResponseBody();

    @NotNull
    public final String string() throws IOException {
        l lVar = get$this_asResponseBody();
        try {
            String B = lVar.B(Util.readBomAsCharset(lVar, charset()));
            g.k(lVar, null);
            return B;
        } finally {
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull m mVar, MediaType mediaType) {
        return INSTANCE.create(mVar, mediaType);
    }

    @NotNull
    public static final ResponseBody create(@NotNull String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @a
    @NotNull
    public static final ResponseBody create(MediaType mediaType, long j10, @NotNull l lVar) {
        return INSTANCE.create(mediaType, j10, lVar);
    }

    @a
    @NotNull
    public static final ResponseBody create(MediaType mediaType, @NotNull m mVar) {
        return INSTANCE.create(mediaType, mVar);
    }

    @a
    @NotNull
    public static final ResponseBody create(MediaType mediaType, @NotNull String str) {
        return INSTANCE.create(mediaType, str);
    }

    @a
    @NotNull
    public static final ResponseBody create(MediaType mediaType, @NotNull byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
