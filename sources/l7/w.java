package l7;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public final class w implements p7.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24191b;

    /* renamed from: c, reason: collision with root package name */
    public final File f24192c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24193d;

    /* renamed from: e, reason: collision with root package name */
    public final p7.d f24194e;

    /* renamed from: f, reason: collision with root package name */
    public a f24195f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24196g;

    public w(Context context, String str, File file, int i10, p7.d dVar) {
        this.f24190a = context;
        this.f24191b = str;
        this.f24192c = file;
        this.f24193d = i10;
        this.f24194e = dVar;
    }

    @Override // p7.d
    public final synchronized p7.a A() {
        try {
            if (!this.f24196g) {
                b();
                this.f24196g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24194e.A();
    }

    public final void a(File file) {
        ReadableByteChannel channel;
        Context context = this.f24190a;
        String str = this.f24191b;
        if (str != null) {
            channel = Channels.newChannel(context.getAssets().open(str));
        } else {
            File file2 = this.f24192c;
            if (file2 != null) {
                channel = new FileInputStream(file2).getChannel();
            } else {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(createTempFile).getChannel();
        try {
            channel2.transferFrom(channel, 0L, Long.MAX_VALUE);
            channel2.force(false);
            channel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            if (createTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th2) {
            channel.close();
            channel2.close();
            throw th2;
        }
    }

    public final void b() {
        boolean z10;
        String databaseName = this.f24194e.getDatabaseName();
        Context context = this.f24190a;
        File databasePath = context.getDatabasePath(databaseName);
        if (this.f24195f != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        n7.a aVar = new n7.a(databaseName, context.getFilesDir(), z10);
        try {
            aVar.f28331b.lock();
            if (aVar.f28332c) {
                try {
                    FileChannel channel = new FileOutputStream(aVar.f28330a).getChannel();
                    aVar.f28333d = channel;
                    channel.lock();
                } catch (IOException e10) {
                    throw new IllegalStateException("Unable to grab copy lock.", e10);
                }
            }
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar.a();
                    return;
                } catch (IOException e11) {
                    throw new RuntimeException("Unable to copy database file.", e11);
                }
            }
            if (this.f24195f == null) {
                aVar.a();
                return;
            }
            try {
                int S = yk.g.S(databasePath);
                int i10 = this.f24193d;
                if (S == i10) {
                    aVar.a();
                    return;
                }
                if (this.f24195f.a(S, i10)) {
                    aVar.a();
                    return;
                }
                if (context.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e12) {
                        Log.w("ROOM", "Unable to copy database file.", e12);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.a();
                return;
            } catch (IOException e13) {
                Log.w("ROOM", "Unable to read database version.", e13);
                aVar.a();
                return;
            }
        } catch (Throwable th2) {
            aVar.a();
            throw th2;
        }
        aVar.a();
        throw th2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f24194e.close();
        this.f24196g = false;
    }

    @Override // p7.d
    public final String getDatabaseName() {
        return this.f24194e.getDatabaseName();
    }

    @Override // p7.d
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        this.f24194e.setWriteAheadLoggingEnabled(z10);
    }
}
