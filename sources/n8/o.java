package n8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import okhttp3.HttpUrl;
import qu.i2;
import qu.r0;
import vt.g0;
import vu.u;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28396a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.c f28397b;

    /* renamed from: c, reason: collision with root package name */
    public final ut.g f28398c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.i f28399d;

    /* renamed from: e, reason: collision with root package name */
    public final h.c f28400e;

    /* renamed from: f, reason: collision with root package name */
    public final c f28401f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f28402g;

    public o(Context context, y8.c cVar, ut.g gVar, ut.g gVar2, ut.g gVar3, c cVar2, d9.i iVar) {
        this.f28396a = context;
        this.f28397b = cVar;
        this.f28398c = gVar;
        this.f28399d = iVar;
        i2 l10 = el.l.l();
        xu.e eVar = r0.f32255a;
        hl.f.d(l10.l(((ru.d) u.f38408a).f34006f).l(new n(this)));
        d9.l lVar = new d9.l(this);
        h.c cVar3 = new h.c(this, lVar);
        this.f28400e = cVar3;
        b bVar = new b(cVar2);
        bVar.b(new v8.a(2), HttpUrl.class);
        bVar.b(new v8.a(5), String.class);
        bVar.b(new v8.a(1), Uri.class);
        bVar.b(new v8.a(4), Uri.class);
        bVar.b(new v8.a(3), Integer.class);
        bVar.b(new v8.a(0), byte[].class);
        Object obj = new Object();
        ArrayList arrayList = bVar.f28361c;
        arrayList.add(new Pair(obj, Uri.class));
        arrayList.add(new Pair(new u8.a(iVar.f14231a), File.class));
        bVar.a(new s8.i(gVar3, gVar2, iVar.f14233c), Uri.class);
        bVar.a(new s8.a(5), File.class);
        bVar.a(new s8.a(0), Uri.class);
        bVar.a(new s8.a(3), Uri.class);
        bVar.a(new s8.a(6), Uri.class);
        bVar.a(new s8.a(4), Drawable.class);
        bVar.a(new s8.a(1), Bitmap.class);
        bVar.a(new s8.a(2), ByteBuffer.class);
        p8.c cVar4 = new p8.c(iVar.f14234d, iVar.f14235e);
        ArrayList arrayList2 = bVar.f28363e;
        arrayList2.add(cVar4);
        List X = yk.o.X(bVar.f28359a);
        this.f28401f = new c(X, yk.o.X(bVar.f28360b), yk.o.X(arrayList), yk.o.X(bVar.f28362d), yk.o.X(arrayList2));
        this.f28402g = g0.J(new t8.i(this, lVar, cVar3), X);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(14:5|6|(5:(1:(1:(10:11|12|13|14|15|16|(1:18)(2:23|(1:25)(2:26|27))|19|20|21)(2:48|49))(7:50|51|52|53|54|55|(1:58)(7:57|15|16|(0)(0)|19|20|21)))(4:66|67|68|69)|65|32|33|(3:35|(1:37)|38)(4:39|40|20|21))(4:102|103|104|(3:106|(2:108|(1:110))|111)(2:112|113))|70|71|(3:73|(2:75|(1:77))(1:94)|(8:79|(1:81)(1:93)|82|(1:84)|85|(1:87)|88|(1:91)(4:90|54|55|(0)(0))))|95|(0)(0)|82|(0)|85|(0)|88|(0)(0)))|116|6|(0)(0)|70|71|(0)|95|(0)(0)|82|(0)|85|(0)|88|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00e4, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0166 A[Catch: all -> 0x0175, TryCatch #6 {all -> 0x0175, blocks: (B:16:0x0160, B:18:0x0166, B:23:0x0177, B:25:0x017b, B:26:0x018f, B:27:0x0194), top: B:15:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0177 A[Catch: all -> 0x0175, TryCatch #6 {all -> 0x0175, blocks: (B:16:0x0160, B:18:0x0166, B:23:0x0177, B:25:0x017b, B:26:0x018f, B:27:0x0194), top: B:15:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a4 A[Catch: all -> 0x01b2, TryCatch #3 {all -> 0x01b2, blocks: (B:33:0x01a0, B:35:0x01a4, B:37:0x01ae, B:38:0x01b1, B:39:0x01b4), top: B:32:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b4 A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #3 {all -> 0x01b2, blocks: (B:33:0x01a0, B:35:0x01a4, B:37:0x01ae, B:38:0x01b1, B:39:0x01b4), top: B:32:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:87:0x0119, B:88:0x011c, B:93:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:87:0x0119, B:88:0x011c, B:93:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:87:0x0119, B:88:0x011c, B:93:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:87:0x0119, B:88:0x011c, B:93:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:87:0x0119, B:88:0x011c, B:93:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Type inference failed for: r1v12, types: [n8.e] */
    /* JADX WARN: Type inference failed for: r1v18, types: [n8.e] */
    /* JADX WARN: Type inference failed for: r4v16, types: [n8.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(n8.o r19, y8.j r20, int r21, yt.a r22) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.o.a(n8.o, y8.j, int, yt.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(y8.e r3, a9.a r4, n8.e r5) {
        /*
            y8.j r0 = r3.f41332b
            boolean r1 = r4 instanceof o8.o
            if (r1 != 0) goto L9
            if (r4 == 0) goto L20
            goto L16
        L9:
            c9.e r1 = r0.f41374m
            r2 = r4
            o8.o r2 = (o8.o) r2
            c9.f r3 = r1.a(r2, r3)
            boolean r1 = r3 instanceof c9.d
            if (r1 == 0) goto L1a
        L16:
            r4.b()
            goto L20
        L1a:
            r5.getClass()
            r3.a()
        L20:
            r5.getClass()
            y8.i r3 = r0.f41365d
            if (r3 == 0) goto L2a
            r3.b()
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.o.b(y8.e, a9.a, n8.e):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(y8.p r3, a9.a r4, n8.e r5) {
        /*
            y8.j r0 = r3.f41407b
            boolean r1 = r4 instanceof o8.o
            if (r1 != 0) goto L9
            if (r4 == 0) goto L20
            goto L16
        L9:
            c9.e r1 = r0.f41374m
            r2 = r4
            o8.o r2 = (o8.o) r2
            c9.f r3 = r1.a(r2, r3)
            boolean r1 = r3 instanceof c9.d
            if (r1 == 0) goto L1a
        L16:
            r4.onSuccess()
            goto L20
        L1a:
            r5.getClass()
            r3.a()
        L20:
            r5.getClass()
            y8.i r3 = r0.f41365d
            if (r3 == 0) goto L2a
            r3.onSuccess()
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.o.c(y8.p, a9.a, n8.e):void");
    }
}
