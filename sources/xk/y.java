package xk;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f40471a;

    /* renamed from: b, reason: collision with root package name */
    public final nl.e0 f40472b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40473c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f40474d;

    public y(FilterOutputStream outputStream, nl.e0 e0Var, boolean z10) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f40471a = outputStream;
        this.f40472b = e0Var;
        this.f40473c = true;
        this.f40474d = z10;
    }

    @Override // xk.w
    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        c(key, null, null);
        f("%s", value);
        h();
        nl.e0 e0Var = this.f40472b;
        if (e0Var != null) {
            e0Var.b(value, Intrinsics.i(key, "    "));
        }
    }

    public final void b(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z10 = this.f40474d;
        OutputStream outputStream = this.f40471a;
        if (!z10) {
            if (this.f40473c) {
                Charset charset = Charsets.UTF_8;
                byte[] bytes = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                String str = z.f40476k;
                if (str != null) {
                    byte[] bytes2 = str.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes2);
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes3);
                    this.f40473c = false;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String m10 = a3.a.m(copyOf, copyOf.length, format, "java.lang.String.format(format, *args)");
            Charset charset2 = Charsets.UTF_8;
            if (m10 != null) {
                byte[] bytes4 = m10.getBytes(charset2);
                Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        Locale locale = Locale.US;
        Object[] copyOf2 = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf2, copyOf2.length));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
        String encode = URLEncoder.encode(format2, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
        byte[] bytes5 = encode.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes5);
    }

    public final void c(String str, String str2, String str3) {
        if (!this.f40474d) {
            b("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                b("; filename=\"%s\"", str2);
            }
            f(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            if (str3 != null) {
                f("%s: %s", "Content-Type", str3);
            }
            f(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            return;
        }
        String m10 = a3.a.m(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)");
        Charset charset = Charsets.UTF_8;
        if (m10 != null) {
            byte[] bytes = m10.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            this.f40471a.write(bytes);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final void d(String key, String str, Uri contentUri) {
        int j10;
        long j11;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        if (str == null) {
            str = "content/unknown";
        }
        c(key, key, str);
        OutputStream outputStream = this.f40471a;
        if (outputStream instanceof k0) {
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            Cursor cursor = null;
            try {
                cursor = FacebookSdk.getApplicationContext().getContentResolver().query(contentUri, null, null, null, null);
                if (cursor == null) {
                    j11 = 0;
                } else {
                    int columnIndex = cursor.getColumnIndex("_size");
                    cursor.moveToFirst();
                    long j12 = cursor.getLong(columnIndex);
                    cursor.close();
                    j11 = j12;
                }
                ((k0) outputStream).a(j11);
                j10 = 0;
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } else {
            j10 = nl.n0.j(FacebookSdk.getApplicationContext().getContentResolver().openInputStream(contentUri), outputStream);
        }
        f(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
        h();
        nl.e0 e0Var = this.f40472b;
        if (e0Var != null) {
            String i10 = Intrinsics.i(key, "    ");
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(j10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            e0Var.b(format, i10);
        }
    }

    public final void e(String key, ParcelFileDescriptor descriptor, String str) {
        int j10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (str == null) {
            str = "content/unknown";
        }
        c(key, key, str);
        OutputStream outputStream = this.f40471a;
        if (outputStream instanceof k0) {
            ((k0) outputStream).a(descriptor.getStatSize());
            j10 = 0;
        } else {
            j10 = nl.n0.j(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), outputStream);
        }
        f(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
        h();
        nl.e0 e0Var = this.f40472b;
        if (e0Var != null) {
            String i10 = Intrinsics.i(key, "    ");
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(j10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            e0Var.b(format, i10);
        }
    }

    public final void f(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        b(format, Arrays.copyOf(args, args.length));
        if (!this.f40474d) {
            b("\r\n", new Object[0]);
        }
    }

    public final void g(String key, Object obj, z zVar) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = z.f40475j;
        if (ek.e.v(obj)) {
            a(key, ek.e.e(obj));
            return;
        }
        boolean z10 = obj instanceof Bitmap;
        OutputStream outputStream = this.f40471a;
        nl.e0 e0Var = this.f40472b;
        if (z10) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            c(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            f(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            h();
            if (e0Var != null) {
                e0Var.b("<Image>", Intrinsics.i(key, "    "));
                return;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bytes = (byte[]) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            c(key, key, "content/unknown");
            outputStream.write(bytes);
            f(HttpUrl.FRAGMENT_ENCODE_SET, new Object[0]);
            h();
            if (e0Var != null) {
                String i10 = Intrinsics.i(key, "    ");
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                e0Var.b(format, i10);
                return;
            }
            return;
        }
        if (obj instanceof Uri) {
            d(key, null, (Uri) obj);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            e(key, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            Parcelable parcelable = xVar.f40470b;
            boolean z11 = parcelable instanceof ParcelFileDescriptor;
            String str2 = xVar.f40469a;
            if (z11) {
                e(key, (ParcelFileDescriptor) parcelable, str2);
                return;
            } else {
                if (parcelable instanceof Uri) {
                    d(key, str2, (Uri) parcelable);
                    return;
                }
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }
        throw new IllegalArgumentException("value is not a supported type.");
    }

    public final void h() {
        if (!this.f40474d) {
            f("--%s", z.f40476k);
            return;
        }
        byte[] bytes = "&".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        this.f40471a.write(bytes);
    }
}
