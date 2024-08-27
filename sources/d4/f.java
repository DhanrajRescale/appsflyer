package d4;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13733a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ClipData f13734b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13735c;

    /* renamed from: d, reason: collision with root package name */
    public int f13736d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f13737e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f13738f;

    public f(f fVar) {
        ClipData clipData = fVar.f13734b;
        clipData.getClass();
        this.f13734b = clipData;
        int i10 = fVar.f13735c;
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i10 <= 5) {
            this.f13735c = i10;
            int i11 = fVar.f13736d;
            if ((i11 & 1) == i11) {
                this.f13736d = i11;
                this.f13737e = fVar.f13737e;
                this.f13738f = fVar.f13738f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
    }

    @Override // d4.g
    public final ClipData a() {
        return this.f13734b;
    }

    @Override // d4.e
    public final h b() {
        return new h(new f(this));
    }

    @Override // d4.e
    public final void c(Uri uri) {
        this.f13737e = uri;
    }

    @Override // d4.e
    public final void d(int i10) {
        this.f13736d = i10;
    }

    @Override // d4.g
    public final int k() {
        return this.f13736d;
    }

    @Override // d4.g
    public final ContentInfo m() {
        return null;
    }

    @Override // d4.g
    public final int p() {
        return this.f13735c;
    }

    @Override // d4.e
    public final void setExtras(Bundle bundle) {
        this.f13738f = bundle;
    }

    public final String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f13733a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f13734b.getDescription());
                sb2.append(", source=");
                int i10 = this.f13735c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        str = String.valueOf(i10);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb2.append(str);
                sb2.append(", flags=");
                int i11 = this.f13736d;
                if ((i11 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i11);
                }
                sb2.append(valueOf);
                Uri uri = this.f13737e;
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (uri == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str2 = ", hasLinkUri(" + this.f13737e.toString().length() + ")";
                }
                sb2.append(str2);
                if (this.f13738f != null) {
                    str3 = ", hasExtras";
                }
                return nn.d.o(sb2, str3, UrlTreeKt.componentParamSuffix);
            default:
                return super.toString();
        }
    }

    public f(ClipData clipData, int i10) {
        this.f13734b = clipData;
        this.f13735c = i10;
    }
}
