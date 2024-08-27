package ll;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import com.facebook.FacebookException;
import com.google.android.material.tabs.TabLayout;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.w;
import nl.n0;
import org.json.JSONException;
import org.json.JSONObject;
import vt.y;

/* loaded from: classes.dex */
public class a implements ln.b, kr.b, or.b, zr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24900a;

    public /* synthetic */ a(int i10) {
        this.f24900a = i10;
    }

    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.E && (view instanceof yo.j)) {
            yo.j jVar = (yo.j) view;
            int contentWidth = jVar.getContentWidth();
            int contentHeight = jVar.getContentHeight();
            int f10 = (int) pn.e.f(24, jVar.getContext());
            if (contentWidth < f10) {
                contentWidth = f10;
            }
            int right = (jVar.getRight() + jVar.getLeft()) / 2;
            int bottom = (jVar.getBottom() + jVar.getTop()) / 2;
            int i10 = contentWidth / 2;
            return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static xk.a b(Bundle bundle, String applicationId) {
        String string;
        xk.h hVar = xk.h.FACEBOOK_APPLICATION_SERVICE;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Date n10 = n0.n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date n11 = n0.n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new xk.a(string2, applicationId, string, stringArrayList, null, null, hVar, n10, new Date(), n11, bundle.getString("graph_domain"));
    }

    public static xk.a d(Collection collection, Bundle bundle, xk.h hVar, String applicationId) {
        Collection collection2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object[] array;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Date n10 = n0.n(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string == null) {
            return null;
        }
        Date n11 = n0.n(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        if (string2 != null && string2.length() > 0) {
            Object[] array2 = w.P(string2, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array2 != null) {
                String[] strArr = (String[]) array2;
                collection2 = y.c(Arrays.copyOf(strArr, strArr.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            collection2 = collection;
        }
        String string3 = bundle.getString("denied_scopes");
        if (string3 != null && string3.length() > 0) {
            Object[] array3 = w.P(string3, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array3 != null) {
                String[] strArr2 = (String[]) array3;
                arrayList = y.c(Arrays.copyOf(strArr2, strArr2.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            arrayList = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (string4 != null && string4.length() > 0) {
            Object[] array4 = w.P(string4, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array4 != null) {
                String[] strArr3 = (String[]) array4;
                arrayList2 = y.c(Arrays.copyOf(strArr3, strArr3.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            arrayList2 = null;
        }
        if (n0.A(string)) {
            return null;
        }
        String string5 = bundle.getString("graph_domain");
        String string6 = bundle.getString("signed_request");
        if (string6 != null && string6.length() != 0) {
            try {
                array = w.P(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            if (array != null) {
                String[] strArr4 = (String[]) array;
                if (strArr4.length == 2) {
                    byte[] data = Base64.decode(strArr4[1], 0);
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    String string7 = new JSONObject(new String(data, Charsets.UTF_8)).getString("user_id");
                    Intrinsics.checkNotNullExpressionValue(string7, "jsonObject.getString(\"user_id\")");
                    return new xk.a(string, applicationId, string7, collection2, arrayList, arrayList2, hVar, n10, new Date(), n11, string5);
                }
                throw new FacebookException("Failed to retrieve user_id from signed_request");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new FacebookException("Authorization response does not contain the signed_request");
    }

    public static xk.i f(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("id_token");
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                return new xk.i(string, str);
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage(), e10);
            }
        }
        return null;
    }

    public static boolean g(TreeMap treeMap, View view, ArrayList arrayList) {
        if (arrayList.contains(view)) {
            return false;
        }
        if (treeMap.containsKey(view)) {
            List list = (List) treeMap.remove(view);
            arrayList.add(view);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!g(treeMap, (View) list.get(i10), arrayList)) {
                    return false;
                }
            }
            arrayList.remove(view);
            return true;
        }
        return true;
    }

    public static String h(StringBuilder sb2) {
        char c10;
        char c11;
        int length = sb2.length();
        if (length != 0) {
            char c12 = 0;
            char charAt = sb2.charAt(0);
            if (length >= 2) {
                c10 = sb2.charAt(1);
            } else {
                c10 = 0;
            }
            if (length >= 3) {
                c11 = sb2.charAt(2);
            } else {
                c11 = 0;
            }
            if (length >= 4) {
                c12 = sb2.charAt(3);
            }
            int i10 = (charAt << 18) + (c10 << '\f') + (c11 << 6) + c12;
            char c13 = (char) ((i10 >> 16) & 255);
            char c14 = (char) ((i10 >> 8) & 255);
            char c15 = (char) (i10 & 255);
            StringBuilder sb3 = new StringBuilder(3);
            sb3.append(c13);
            if (length >= 2) {
                sb3.append(c14);
            }
            if (length >= 3) {
                sb3.append(c15);
            }
            return sb3.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public static void i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (nl.d.a() != null) {
            nl.d.a();
            return;
        }
        nl.d dVar = new nl.d(context);
        if (!sl.a.b(nl.d.class)) {
            try {
                if (!sl.a.b(dVar)) {
                    try {
                        a5.b a10 = a5.b.a(dVar.f28846a);
                        Intrinsics.checkNotNullExpressionValue(a10, "getInstance(applicationContext)");
                        a10.b(dVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th2) {
                        sl.a.a(dVar, th2);
                    }
                }
            } catch (Throwable th3) {
                sl.a.a(nl.d.class, th3);
            }
        }
        if (!sl.a.b(nl.d.class)) {
            try {
                nl.d.f28845b = dVar;
            } catch (Throwable th4) {
                sl.a.a(nl.d.class, th4);
            }
        }
        nl.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r7.append((char) 31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r6 = r7.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r6 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r6 != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r13.c(r10.length());
        r8 = r13.f30268f.f30276b - r10.length();
        r0 = (r0.length() - r13.f30269g) - r13.f30266d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r0 <= r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        r13.c(r10.length() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r8 = r13.f30268f.f30276b - r10.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        if (r0 > r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r8 > 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (r6 > 4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        r0 = h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if ((!r13.b()) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        if (r6 > 2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r6 > 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
    
        r13.c(r10.length() + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if ((r13.f30268f.f30276b - r10.length()) < 3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        r13.c(r10.length() + r0.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ee, code lost:
    
        r10.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        if (r5 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e6, code lost:
    
        r13.f30268f = null;
        r13.f30266d -= r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        throw new java.lang.IllegalStateException("Count must not exceed 4");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fb, code lost:
    
        r13.f30267e = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        throw r0;
     */
    @Override // or.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(or.c r13) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.a.c(or.c):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kr.b
    public final mr.b e(String str, int i10, int i11, int i12, Map map) {
        kr.b bVar;
        if (i10 != 0) {
            int i13 = 0;
            int i14 = 1;
            int i15 = 2;
            int i16 = 23;
            int i17 = 21;
            switch (i10 - 1) {
                case 0:
                    bVar = new e(i17);
                    break;
                case 1:
                    bVar = new Object();
                    break;
                case 2:
                    bVar = new pr.d(i14);
                    break;
                case 3:
                    bVar = new pr.d(i15);
                    break;
                case 4:
                    bVar = new pr.d(i13);
                    break;
                case 5:
                    bVar = new f(i17);
                    break;
                case 6:
                    bVar = new pr.g(1);
                    break;
                case 7:
                    bVar = new pr.g(0);
                    break;
                case 8:
                    bVar = new Object();
                    break;
                case 9:
                case 12:
                case 13:
                default:
                    throw new IllegalArgumentException("No encoder available for format ".concat(jr.h.A(i10)));
                case 10:
                    bVar = new e(i16);
                    break;
                case 11:
                    bVar = new f(i16);
                    break;
                case 14:
                    bVar = new o(19, 0);
                    break;
                case 15:
                    bVar = new pr.g(2);
                    break;
            }
            return bVar.e(str, i10, i11, i12, map);
        }
        throw null;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f24900a) {
            case 15:
                return "com.google.android.datatransport.events";
            default:
                return new rn.c(1);
        }
    }

    public void j(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(vn.a.c((int) a10.left, f10, (int) a11.left), drawable.getBounds().top, vn.a.c((int) a10.right, f10, (int) a11.right), drawable.getBounds().bottom);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        this(0);
        this.f24900a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            default:
                switch (i10) {
                    case 26:
                        this(26);
                        return;
                    case 27:
                        this(27);
                        return;
                    case 28:
                        this(28);
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj) {
        this(25);
        this.f24900a = 25;
    }
}
