package com.example.android.miwok;


    public class Word {

        /** Default translation for the word */
        private String mDefaultTranslation;

        /** Miwok translation for the word */
        private String mMiwokTranslation;

        /** Gets the img resource id*/
        private int mImageResourceId = NO_IMAGE_PROVIDED;

        /** Constant value that represents no image provided for the word
         * */
        private static final int NO_IMAGE_PROVIDED = -1;

        /**
         * Create a new Word object.
         *
         * @param defaultTranslation is the word in a language that the user is already familiar with
         *                           (such as English)
         * @param miwokTranslation is the word in the Miwok language
         *
         * @param
         */
        public Word(String defaultTranslation, String miwokTranslation) {
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
        }

        /**
         * Create a new Word object.
         *
         * @param defaultTranslation is the word in a language that the user is already familiar with
         *                           (such as English)
         * @param miwokTranslation is the word in the Miwok language
         *
         * @param imageResourceId is the drawable resource id for the image associated with the word
         */
        public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
            mImageResourceId = imageResourceId;
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
        }

        /**
         * Get the default translation of the word.
         */
        public String getDefaultTranslation() {
            return mDefaultTranslation;
        }

        /**
         * Get the Miwok translation of the word.
         */
        public String getMiwokTranslation() {
            return mMiwokTranslation;
        }

        /**
         * Get the img resource id .
         */
        public int getmImageResourceId(){
            return mImageResourceId;
        }

        /**
         * Returns whether or not there is an image for this word.
         */
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }

    }
