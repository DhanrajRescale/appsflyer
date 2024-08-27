package qu;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.assetgro.stockgro.prod.R;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.x3;
import m.z3;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlSerializer;
import t0.o3;
import ut.l;

/* loaded from: classes2.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static Field f32217a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f32218b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f32219c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f32220d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f32221e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f32222f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f32223g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f32224h;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ba, code lost:
    
        if (r0.equals("video/mp2t") == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A(java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.i0.A(java.util.Map):int");
    }

    public static int B(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (!lastPathSegment.endsWith(".avi")) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static final androidx.lifecycle.d0 C(androidx.lifecycle.e0 e0Var, Function1 transform) {
        androidx.lifecycle.d0 d0Var;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (e0Var.isInitialized()) {
            d0Var = new androidx.lifecycle.d0(transform.invoke(e0Var.getValue()));
        } else {
            d0Var = new androidx.lifecycle.d0();
        }
        d0Var.a(e0Var, new androidx.lifecycle.z0(new d2.y0(12, d0Var, transform)));
        return d0Var;
    }

    public static float D(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return h4.f.c(edgeEffect, f10, f11);
        }
        h4.e.a(edgeEffect, f10, f11);
        return f10;
    }

    public static void E(Context context, String str) {
        if (str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception e10) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e10);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r2.isEmpty() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        android.util.Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r6 != 4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4.getName().equals("locales") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String F(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.i0.F(android.content.Context):java.lang.String");
    }

    public static final c.n G(f.a contract, Function1 onResult, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-1408504823);
        t0.g1 r02 = t0.t.r0(contract, rVar);
        t0.g1 r03 = t0.t.r0(onResult, rVar);
        Object y02 = el.l.y0(new Object[0], null, c.e.f7415a, rVar, 3080, 6);
        Intrinsics.checkNotNullExpressionValue(y02, "rememberSaveable { UUID.randomUUID().toString() }");
        String str = (String) y02;
        t0.p0 p0Var = c.l.f7432a;
        rVar.b0(1418020823);
        e.i iVar = (e.i) rVar.m(c.l.f7432a);
        if (iVar == null) {
            Object obj = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
            while (true) {
                if (obj instanceof ContextWrapper) {
                    if (obj instanceof e.i) {
                        break;
                    }
                    obj = ((ContextWrapper) obj).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(obj, "innerContext.baseContext");
                } else {
                    obj = null;
                    break;
                }
            }
            iVar = (e.i) obj;
        }
        rVar.s(false);
        if (iVar != null) {
            e.h activityResultRegistry = iVar.getActivityResultRegistry();
            rVar.b0(-3687241);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                Q = new Object();
                rVar.k0(Q);
            }
            rVar.s(false);
            c.a aVar = (c.a) Q;
            rVar.b0(-3687241);
            Object Q2 = rVar.Q();
            if (Q2 == eVar) {
                Q2 = new c.n(aVar, r02);
                rVar.k0(Q2);
            }
            rVar.s(false);
            c.n nVar2 = (c.n) Q2;
            c.d dVar = new c.d(aVar, activityResultRegistry, str, contract, r03, 0);
            rVar.b0(-1239538271);
            rVar.b0(592135039);
            boolean h10 = rVar.h(contract) | rVar.h(activityResultRegistry) | rVar.h(str);
            Object Q3 = rVar.Q();
            if (h10 || Q3 == eVar) {
                Q3 = new t0.m0(dVar);
                rVar.k0(Q3);
            }
            v.e.x(rVar, false, false, false);
            return nVar2;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }

    public static final void H(View view, androidx.lifecycle.i1 i1Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, i1Var);
    }

    public static void I(TextView textView, int i10) {
        int i11;
        k(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            h4.t.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (h4.p.a(textView)) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void J(TextView textView, int i10) {
        int i11;
        k(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (h4.p.a(textView)) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void K(TextView textView, CharSequence charSequence) {
        boolean z10;
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else {
                    boolean z11 = true;
                    if (charSequence == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (text != null) {
                        z11 = false;
                    }
                    if (z10 == z11) {
                        if (charSequence != null) {
                            int length = charSequence.length();
                            if (length == text.length()) {
                                for (int i10 = 0; i10 < length; i10++) {
                                    if (charSequence.charAt(i10) == text.charAt(i10)) {
                                    }
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                textView.setText(charSequence);
            }
        }
    }

    public static void L(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            x3.a(view, charSequence);
            return;
        }
        z3 z3Var = z3.f25835k;
        if (z3Var != null && z3Var.f25837a == view) {
            z3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z3 z3Var2 = z3.f25836l;
            if (z3Var2 != null && z3Var2.f25837a == view) {
                z3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new z3(view, charSequence);
    }

    public static final String M(yt.a aVar) {
        Object a10;
        if (aVar instanceof vu.h) {
            return aVar.toString();
        }
        try {
            l.Companion companion = ut.l.INSTANCE;
            a10 = aVar + '@' + w(aVar);
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        if (ut.l.a(a10) != null) {
            a10 = aVar.getClass().getName() + '@' + w(aVar);
        }
        return (String) a10;
    }

    public static String N(int i10) {
        if (q(i10, 1)) {
            return "Text";
        }
        if (q(i10, 2)) {
            return "Ascii";
        }
        if (q(i10, 3)) {
            return "Number";
        }
        if (q(i10, 4)) {
            return "Phone";
        }
        if (q(i10, 5)) {
            return "Uri";
        }
        if (q(i10, 6)) {
            return "Email";
        }
        if (q(i10, 7)) {
            return "Password";
        }
        if (q(i10, 8)) {
            return "NumberPassword";
        }
        if (q(i10, 9)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public static Bundle O(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(i0.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static ActionMode.Callback P(ActionMode.Callback callback) {
        if ((callback instanceof h4.u) && Build.VERSION.SDK_INT >= 26) {
            return ((h4.u) callback).f17981a;
        }
        return callback;
    }

    public static final t.m0 Q(t.k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        return new t.m0(k0Var, 0);
    }

    public static ActionMode.Callback R(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof h4.u) && callback != null) {
            return new h4.u(callback, textView);
        }
        return callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r16, g1.o r17, w.f0 r18, java.lang.String r19, hu.c r20, t0.n r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.i0.a(java.lang.Object, g1.o, w.f0, java.lang.String, hu.c, t0.n, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d3, code lost:
    
        r26 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01dd, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c5, code lost:
    
        if (r19 >= 0) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0224 A[LOOP:4: B:106:0x0222->B:107:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d3 A[EDGE_INSN: B:112:0x01d3->B:113:0x01d3 BREAK  A[LOOP:1: B:65:0x01a7->B:69:0x01ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(w.u1 r23, g1.o r24, w.f0 r25, kotlin.jvm.functions.Function1 r26, hu.c r27, t0.n r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.i0.b(w.u1, g1.o, w.f0, kotlin.jvm.functions.Function1, hu.c, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(g1.o r30, c0.m0 r31, b0.h1 r32, boolean r33, b0.j r34, g1.b r35, y.x0 r36, boolean r37, kotlin.jvm.functions.Function1 r38, t0.n r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.i0.c(g1.o, c0.m0, b0.h1, boolean, b0.j, g1.b, y.x0, boolean, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(g1.o r30, c0.m0 r31, b0.h1 r32, boolean r33, b0.h r34, g1.c r35, y.x0 r36, boolean r37, kotlin.jvm.functions.Function1 r38, t0.n r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.i0.d(g1.o, c0.m0, b0.h1, boolean, b0.h, g1.c, y.x0, boolean, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e.m, java.lang.Object] */
    public static final e.m e(f.f mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        e.l lVar = new e.l(0);
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        lVar.f14641b = mediaType;
        ?? obj = new Object();
        obj.f14642a = f.c.f15870a;
        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
        obj.f14642a = mediaType;
        return obj;
    }

    public static final void f(t.g gVar, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int[] iArr = new int[i10];
        gVar.getClass();
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        gVar.f34856a = iArr;
        Object[] objArr = new Object[i10];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        gVar.f34857b = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if ((!r8) == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(x1.m0 r7, yt.a r8) {
        /*
            boolean r0 = r8 instanceof y.y0
            if (r0 == 0) goto L13
            r0 = r8
            y.y0 r0 = (y.y0) r0
            int r1 = r0.f40998c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40998c = r1
            goto L18
        L13:
            y.y0 r0 = new y.y0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f40997b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40998c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            x1.m0 r7 = r0.f40996a
            ut.n.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            ut.n.b(r8)
            x1.o0 r8 = r7.f39891f
            x1.k r8 = r8.f39900p
            java.util.List r8 = r8.f39870a
            int r2 = r8.size()
            r5 = r4
        L40:
            if (r5 >= r2) goto L51
            java.lang.Object r6 = r8.get(r5)
            x1.t r6 = (x1.t) r6
            boolean r6 = r6.f39912d
            if (r6 == 0) goto L4e
            r8 = r3
            goto L52
        L4e:
            int r5 = r5 + 1
            goto L40
        L51:
            r8 = r4
        L52:
            r8 = r8 ^ r3
            if (r8 != 0) goto L7b
        L55:
            x1.l r8 = x1.l.f39879c
            r0.f40996a = r7
            r0.f40998c = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            x1.k r8 = (x1.k) r8
            java.util.List r8 = r8.f39870a
            int r2 = r8.size()
            r5 = r4
        L6b:
            if (r5 >= r2) goto L7b
            java.lang.Object r6 = r8.get(r5)
            x1.t r6 = (x1.t) r6
            boolean r6 = r6.f39912d
            if (r6 == 0) goto L78
            goto L55
        L78:
            int r5 = r5 + 1
            goto L6b
        L7b:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.i0.g(x1.m0, yt.a):java.lang.Object");
    }

    public static final Object h(x1.z zVar, Function2 function2, yt.a aVar) {
        Object Q0 = ((x1.o0) zVar).Q0(new y.z0(aVar.getContext(), function2, null), aVar);
        if (Q0 == zt.a.f42823a) {
            return Q0;
        }
        return Unit.f23355a;
    }

    public static r0.e0 i(long j10, long j11, t0.n nVar, int i10, int i11) {
        long j12;
        long j13;
        long j14;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-1589582123);
        if ((i11 & 1) != 0) {
            j12 = n1.t.f28177i;
        } else {
            j12 = j10;
        }
        if ((i11 & 2) != 0) {
            j13 = r0.n0.b(j12, rVar);
        } else {
            j13 = j11;
        }
        long j15 = 0;
        if ((i11 & 4) != 0) {
            j14 = n1.t.f28177i;
        } else {
            j14 = 0;
        }
        if ((i11 & 8) != 0) {
            j15 = n1.t.c(j13, 0.38f);
        }
        r0.e0 u10 = u((r0.l0) rVar.m(r0.n0.f32600a));
        long j16 = n1.t.f28177i;
        if (j12 == j16) {
            j12 = u10.f32379a;
        }
        long j17 = j12;
        if (j13 == j16) {
            j13 = u10.f32380b;
        }
        long j18 = j13;
        if (j14 == j16) {
            j14 = u10.f32381c;
        }
        long j19 = j14;
        if (j15 == j16) {
            j15 = u10.f32382d;
        }
        r0.e0 e0Var = new r0.e0(j17, j18, j19, j15);
        rVar.s(false);
        return e0Var;
    }

    public static r0.h0 j(float f10, t0.n nVar, int i10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-574898487);
        if ((i10 & 1) != 0) {
            f10 = s0.f.f34061a;
        }
        float f16 = f10;
        if ((i10 & 2) != 0) {
            f11 = s0.f.f34068h;
        } else {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = s0.f.f34066f;
        } else {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = s0.f.f34067g;
        } else {
            f13 = 0.0f;
        }
        if ((i10 & 16) != 0) {
            f14 = s0.f.f34065e;
        } else {
            f14 = 0.0f;
        }
        if ((i10 & 32) != 0) {
            f15 = s0.f.f34064d;
        } else {
            f15 = 0.0f;
        }
        r0.h0 h0Var = new r0.h0(f16, f11, f12, f13, f14, f15);
        rVar.s(false);
        return h0Var;
    }

    public static void k(int i10) {
        if (i10 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static final t0.g1 m(a0.k kVar, t0.n nVar, int i10) {
        boolean z10;
        t0.r rVar = (t0.r) nVar;
        Object g10 = v.e.g(rVar, -1805515472, 1885674597);
        to.e eVar = t0.m.f35080a;
        if (g10 == eVar) {
            g10 = t0.t.n0(Boolean.FALSE, o3.f35116a);
            rVar.k0(g10);
        }
        t0.g1 g1Var = (t0.g1) g10;
        rVar.s(false);
        rVar.b0(1885674657);
        if ((((i10 & 14) ^ 6) > 4 && rVar.h(kVar)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        if (z10 || Q == eVar) {
            Q = new a0.g(kVar, g1Var, null);
            rVar.k0(Q);
        }
        rVar.s(false);
        t0.t.e(kVar, (Function2) Q, rVar);
        rVar.s(false);
        return g1Var;
    }

    public static m0.k1 n(long j10, t0.n nVar, int i10, int i11) {
        long j11;
        long j12;
        long j13;
        long j14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(469524104);
        if ((i11 & 1) != 0) {
            j11 = ((n1.t) ((m0.v0) rVar.m(m0.x0.f27075a)).f26920c.getValue()).f28179a;
        } else {
            j11 = j10;
        }
        long j15 = 0;
        if ((i11 & 2) != 0) {
            j12 = n1.t.c(((m0.v0) rVar.m(m0.x0.f27075a)).b(), 0.6f);
        } else {
            j12 = 0;
        }
        if ((i11 & 4) != 0) {
            j13 = ((m0.v0) rVar.m(m0.x0.f27075a)).d();
        } else {
            j13 = 0;
        }
        if ((i11 & 8) != 0) {
            j14 = n1.t.c(((m0.v0) rVar.m(m0.x0.f27075a)).b(), vl.b.r(rVar));
        } else {
            j14 = 0;
        }
        if ((i11 & 16) != 0) {
            j15 = n1.t.c(j11, vl.b.r(rVar));
        }
        rVar.b0(-533071066);
        if ((((i10 & 14) ^ 6) > 4 && rVar.g(j11)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i10 & 112) ^ 48) > 32 && rVar.g(j12)) || (i10 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z16 = z10 | z11;
        if ((((i10 & 896) ^ 384) > 256 && rVar.g(j13)) || (i10 & 384) == 256) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z17 = z16 | z12;
        if ((((i10 & 7168) ^ 3072) > 2048 && rVar.g(j14)) || (i10 & 3072) == 2048) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z18 = z17 | z13;
        if ((((57344 & i10) ^ 24576) > 16384 && rVar.g(j15)) || (i10 & 24576) == 16384) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z19 = z18 | z14;
        Object Q = rVar.Q();
        if (!z19 && Q != t0.m.f35080a) {
            z15 = false;
        } else {
            long j16 = j14;
            z15 = false;
            long j17 = j15;
            m0.k1 k1Var = new m0.k1(j13, n1.t.c(j13, s0.g.f34069a), j11, n1.t.c(j11, s0.g.f34069a), j16, n1.t.c(j16, s0.g.f34069a), j17, j11, j12, j16, j17);
            rVar.k0(k1Var);
            Q = k1Var;
        }
        m0.k1 k1Var2 = (m0.k1) Q;
        rVar.s(z15);
        rVar.s(z15);
        return k1Var2;
    }

    public static boolean o(Editable editable, KeyEvent keyEvent, boolean z10) {
        q4.b[] bVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (bVarArr = (q4.b[]) editable.getSpans(selectionStart, selectionEnd, q4.b.class)) != null && bVarArr.length > 0) {
            for (q4.b bVar : bVarArr) {
                int spanStart = editable.getSpanStart(null);
                int spanEnd = editable.getSpanEnd(null);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static final void p(Context context, String str, ImageView imageView, nk.d dVar) {
        nk.a f10 = ((nk.e) new nk.a().o(jk.i.f21456b, Boolean.TRUE)).f(ak.p.f558d);
        Intrinsics.checkNotNullExpressionValue(f10, "diskCacheStrategy(...)");
        nk.e eVar = (nk.e) f10;
        if (dVar != null) {
            Intrinsics.c(context);
            com.bumptech.glide.g w10 = com.bumptech.glide.b.c(context).d(context).m(str).w(eVar);
            w10.G = null;
            ArrayList arrayList = new ArrayList();
            w10.G = arrayList;
            arrayList.add(dVar);
            Intrinsics.c(imageView);
            w10.z(imageView);
            return;
        }
        Intrinsics.c(context);
        com.bumptech.glide.g w11 = com.bumptech.glide.b.c(context).d(context).m(str).w(eVar);
        Intrinsics.c(imageView);
        w11.z(imageView);
    }

    public static final boolean q(int i10, int i11) {
        return i10 == i11;
    }

    public static final androidx.lifecycle.i1 r(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (androidx.lifecycle.i1) pu.p.f(pu.p.h(pu.m.d(androidx.lifecycle.j1.f1923d, view), androidx.lifecycle.j1.f1924e));
    }

    public static final String s(ou.b bVar) {
        String str;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        iu.e eVar = (iu.e) bVar;
        eVar.getClass();
        iu.e.INSTANCE.getClass();
        Class jClass = eVar.f20549a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean isArray = jClass.isArray();
        HashMap hashMap = iu.e.f20547d;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = (String) hashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getCanonicalName();
        }
        return str3;
    }

    public static final androidx.lifecycle.q t(androidx.lifecycle.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        while (true) {
            androidx.lifecycle.q qVar = (androidx.lifecycle.q) oVar.f1953a.get();
            if (qVar != null) {
                return qVar;
            }
            i2 l10 = el.l.l();
            xu.e eVar = r0.f32255a;
            androidx.lifecycle.q qVar2 = new androidx.lifecycle.q(oVar, l10.l(((ru.d) vu.u.f38408a).f34006f));
            AtomicReference atomicReference = oVar.f1953a;
            while (!atomicReference.compareAndSet(null, qVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            xu.e eVar2 = r0.f32255a;
            yk.g.H(qVar2, ((ru.d) vu.u.f38408a).f34006f, null, new androidx.lifecycle.p(qVar2, null), 2);
            return qVar2;
        }
    }

    public static r0.e0 u(r0.l0 l0Var) {
        r0.e0 e0Var = l0Var.L;
        if (e0Var == null) {
            float f10 = s0.f.f34061a;
            r0.e0 e0Var2 = new r0.e0(r0.n0.c(l0Var, 44), r0.n0.a(l0Var, r0.n0.c(l0Var, 44)), androidx.compose.ui.graphics.a.n(n1.t.c(r0.n0.c(l0Var, s0.f.f34063c), 0.38f), r0.n0.e(l0Var, s0.f.f34064d)), n1.t.c(r0.n0.a(l0Var, r0.n0.c(l0Var, 44)), 0.38f));
            l0Var.L = e0Var2;
            return e0Var2;
        }
        return e0Var;
    }

    public static float v(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return h4.f.b(edgeEffect);
        }
        return s0.g.f34069a;
    }

    public static final String w(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static b4.h x(TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new b4.h(h4.t.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a10 = h4.r.a(textView);
        int d10 = h4.r.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z10 = true;
            if (i10 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(h4.t.b(h4.s.a(h4.q.d(textView)))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (h4.q.b(textView) != 1) {
                    z10 = false;
                }
                switch (h4.q.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new b4.h(textPaint, textDirectionHeuristic, a10, d10);
    }

    public static int y(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 != 32) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            if (i10 == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(jr.h.n("type needs to be >= FIRST and <= LAST, type=", i10));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static final int z(t.g gVar, Object obj, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i11 = gVar.f34858c;
        if (i11 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        try {
            int a10 = u.a.a(gVar.f34858c, i10, gVar.f34856a);
            if (a10 < 0) {
                return a10;
            }
            if (Intrinsics.a(obj, gVar.f34857b[a10])) {
                return a10;
            }
            int i12 = a10 + 1;
            while (i12 < i11 && gVar.f34856a[i12] == i10) {
                if (Intrinsics.a(obj, gVar.f34857b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a10 - 1; i13 >= 0 && gVar.f34856a[i13] == i10; i13--) {
                if (Intrinsics.a(obj, gVar.f34857b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
