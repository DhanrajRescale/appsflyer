package d7;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.assetgro.stockgro.prod.R;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class g implements p0, ek.x, kk.a {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f14041a;

    public g(Resources resources) {
        resources.getClass();
        this.f14041a = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(b5.v r10) {
        /*
            r9 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = r10.f3643c
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            java.lang.String r4 = ""
            r5 = 0
            if (r2 != 0) goto L42
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L18
            goto L42
        L18:
            int r2 = e5.x.f15050a
            r6 = 21
            if (r2 < r6) goto L23
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            goto L29
        L23:
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r1)
            r1 = r6
        L29:
            r6 = 24
            if (r2 < r6) goto L34
            java.util.Locale$Category r2 = java.util.Locale.Category.DISPLAY
            java.util.Locale r2 = java.util.Locale.getDefault(r2)
            goto L38
        L34:
            java.util.Locale r2 = java.util.Locale.getDefault()
        L38:
            java.lang.String r1 = r1.getDisplayName(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L44
        L42:
            r1 = r4
            goto L63
        L44:
            int r6 = r1.offsetByCodePoints(r5, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L63
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L63
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L63
            java.lang.String r8 = r1.substring(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L63
            java.lang.String r2 = r8.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L63
            r7.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L63
            java.lang.String r2 = r1.substring(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L63
            r7.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L63
            java.lang.String r1 = r7.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L63
        L63:
            r0[r5] = r1
            java.lang.String r1 = r9.b(r10)
            r0[r3] = r1
            java.lang.String r0 = r9.d(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L80
            java.lang.String r10 = r10.f3642b
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L7e
            goto L7f
        L7e:
            r4 = r10
        L7f:
            r0 = r4
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.g.a(b5.v):java.lang.String");
    }

    public String b(b5.v vVar) {
        String str;
        int i10 = vVar.f3645e & 2;
        Resources resources = this.f14041a;
        if (i10 != 0) {
            str = resources.getString(R.string.exo_track_role_alternate);
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i11 = vVar.f3645e;
        if ((i11 & 4) != 0) {
            str = d(str, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i11 & 8) != 0) {
            str = d(str, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i11 & 1088) != 0) {
            return d(str, resources.getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    public String c(b5.v vVar) {
        String a10;
        String str;
        String str2;
        int h10 = b5.r0.h(vVar.f3652l);
        int i10 = vVar.f3665y;
        int i11 = vVar.f3658r;
        int i12 = vVar.f3657q;
        if (h10 == -1) {
            String str3 = vVar.f3649i;
            if (b5.r0.i(str3) == null) {
                if (b5.r0.b(str3) == null) {
                    if (i12 == -1 && i11 == -1) {
                        if (i10 == -1 && vVar.f3666z == -1) {
                            h10 = -1;
                        }
                    }
                }
                h10 = 1;
            }
            h10 = 2;
        }
        Resources resources = this.f14041a;
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        int i13 = vVar.f3648h;
        if (h10 == 2) {
            String[] strArr = new String[3];
            strArr[0] = b(vVar);
            if (i12 != -1 && i11 != -1) {
                str2 = resources.getString(R.string.exo_track_resolution, Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            strArr[1] = str2;
            if (i13 != -1) {
                str4 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i13 / 1000000.0f));
            }
            strArr[2] = str4;
            a10 = d(strArr);
        } else if (h10 == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = a(vVar);
            if (i10 != -1 && i10 >= 1) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 6 && i10 != 7) {
                            if (i10 != 8) {
                                str = resources.getString(R.string.exo_track_surround);
                            } else {
                                str = resources.getString(R.string.exo_track_surround_7_point_1);
                            }
                        } else {
                            str = resources.getString(R.string.exo_track_surround_5_point_1);
                        }
                    } else {
                        str = resources.getString(R.string.exo_track_stereo);
                    }
                } else {
                    str = resources.getString(R.string.exo_track_mono);
                }
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            strArr2[1] = str;
            if (i13 != -1) {
                str4 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i13 / 1000000.0f));
            }
            strArr2[2] = str4;
            a10 = d(strArr2);
        } else {
            a10 = a(vVar);
        }
        if (a10.length() == 0) {
            return resources.getString(R.string.exo_track_unknown);
        }
        return a10;
    }

    public String d(String... strArr) {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f14041a.getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }

    @Override // ek.x
    public ek.w f(ek.c0 c0Var) {
        return new ek.a0(this.f14041a, c0Var.a(Uri.class, ParcelFileDescriptor.class));
    }

    @Override // kk.a
    public ak.e0 l(ak.e0 e0Var, xj.k kVar) {
        if (e0Var == null) {
            return null;
        }
        return new hk.c(this.f14041a, e0Var);
    }

    public /* synthetic */ g(Resources resources, int i10) {
        if (i10 != 1) {
            this.f14041a = resources;
        } else {
            this.f14041a = resources;
        }
    }
}
